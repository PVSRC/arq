package br.cefetrj.arq;

import java.io.RandomAccessFile;

public class Hash
{
	public static void criaTabela(RandomAccessFile f, long n) throws Exception
	{
		Elemento h = new Elemento();
		h.setCEP(-1);
		h.setEndereco(-1);
		h.setProximo(-1);
		for(int i = 0; i < n; i++){
			h.escreveCep(f);				
		}
	}
	
	public static void criaHash(RandomAccessFile f, RandomAccessFile r, long n) throws Exception
	{
		long i = 0;
		long p = 0;
		Elemento h = new Elemento();
		Endereco e = new Endereco();
		while(f.getFilePointer() < f.length()){
			e.leEndereco(f);
			p = Long.parseLong(e.getCEP()) % n;
			r.seek(p*24);
			h.leCep(r);
			if(h.getCEP() == -1){
				h.setCEP(Long.parseLong(e.getCEP()));
				h.setEndereco(i);
				h.setProximo(-1);
				r.seek(p*24);
				h.escreveCep(r);				
			}else{
				long prox = h.getProximo();
				h.setProximo(r.length());
				r.seek(p*24);
				h.escreveCep(r);
				r.seek(r.length());
				h.setCEP(Long.parseLong(e.getCEP()));
				h.setEndereco(i);
				h.setProximo(prox);
				h.escreveCep(r);				
			}i++;		
		}
	}
	
	public static void ler(RandomAccessFile r, RandomAccessFile f, long cep) throws Exception
	{
		Elemento h = new Elemento();
		long p = cep % 900001;
		r.seek(p*24);
		h.leCep(r);
		while(h.getCEP() != cep && h.getProximo() != -1)
		{
			r.seek(h.getProximo());
			h.leCep(r);
		}
		if(h.getCEP() == cep)
		{
			f.seek(h.getEndereco()*300);
			Endereco e = new Endereco();
			e.leEndereco(f);
			System.out.println(e.getLogradouro());
			System.out.println(e.getBairro());
			System.out.println(e.getCidade());
			System.out.println(e.getEstado());
			System.out.println(e.getSigla());
			System.out.println(e.getCEP());			
		}
	}
	
}
