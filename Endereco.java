package br.cefetrj.arq;

import java.io.DataInput;
import java.io.IOException;
import java.nio.charset.Charset;

public class Endereco
{
	
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String sigla;
	private String cep;

	public void leEndereco(DataInput din) throws IOException
	{
		byte logradouro[] = new byte[72];
		byte bairro[] = new byte[72];
		byte cidade[] = new byte[72];
		byte estado[] = new byte[72];
		byte sigla[] = new byte[2];
		byte cep[] = new byte[8];
		
		din.readFully(logradouro);
		din.readFully(bairro);
		din.readFully(cidade);
		din.readFully(estado);
		din.readFully(sigla);
		din.readFully(cep);
		din.readByte(); // Ultimo espaco vazio 
		din.readByte(); // Quebra
		
		Charset enc = Charset.forName("ISO-8859-1"); // Definie como caracteres est�o codificados.
		
		this.logradouro = new String(logradouro,enc);
		this.bairro = new String(bairro,enc);
		this.cidade = new String(cidade,enc);
		this.estado = new String(estado,enc);
		this.sigla = new String(sigla,enc);
		this.cep = new String(cep,enc);
	}
	
	public String getCEP()
	{
		return cep;
	}
	
	public void setCEP(String cep)
	{
		this.cep = cep;
	}
	
	public String getSigla()
	{
		return sigla;
	}
	
	public void setSigla(String sigla)
	{
		this.sigla = sigla;
	}
	
	public String getEstado()
	{
		return estado;
	}
	
	public void setEstado(String estado)
	{
		this.estado = estado;
	}
	
	public String getCidade()
	{
		return cidade;
	}
	
	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}
	
	public String getBairro()
	{
		return bairro;
	}
			
	public void setBairro(String bairro)
	{
		this.bairro = bairro;
	}
	
	public String getLogradouro()
	{
		return logradouro;
	}
	
	public void setLogradouro(String logradouro)
	{
		this.logradouro = logradouro;
	}

}
