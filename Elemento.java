package br.cefetrj.arq;

import java.io.DataInput;
import java.io.DataOutput;

public class Elemento {
	private long cep;
	private long endereco;
	private long proximo;
	
	public long getProximo()
	{
		return proximo;
	}
	
	public void setProximo(long proximo)
	{
		this.proximo = proximo;
	}
	
	public long getEndereco()
	{
		return endereco;
	}
	
	public void setEndereco(long endereco)
	{
		this.endereco = endereco;
	}
	
	public long getCEP()
	{
		return cep;
	}
	
	public void setCEP(long cep)
	{
		this.cep = cep;
	}
	
	public void escreveCep(DataOutput dout) throws Exception
	{
		dout.writeLong(this.proximo);
		dout.writeLong(this.endereco);
		dout.writeLong(this.cep);
	}
	
	public void leCep(DataInput din) throws Exception
	{
		this.proximo = din.readLong();
        this.endereco = din.readLong();
        this.cep = din.readLong();
	}
	
}
