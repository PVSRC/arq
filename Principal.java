package br.cefetrj.arq;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite 1 para criar indice do Hash");
		System.out.println("Digite 2 para fazer uma procura de CEP");
		int i = sc1.nextInt();
		int conf = 0;
		switch (i)
			{
			case 1:
				System.out.println("Entre com o arquivo");
				Scanner sc2 = new Scanner(System.in);
				String arqv = sc2.nextLine();
				System.out.println("Digite o nome do arquivo que sera criado");
				Scanner sc3 = new Scanner(System.in);
				String hash = sc3.nextLine();
				RandomAccessFile r = new RandomAccessFile(arqv,"r");
				RandomAccessFile f = new RandomAccessFile(hash,"rw");
				System.out.println("A função de Hash usada é CEP % n, entre com o n desejado");
				Scanner sc4 = new Scanner(System.in);
				long n = sc4.nextLong();
				Hash.criaTabela(f, n);
				Hash.criaHash(r, f, n);
				System.out.println("Hash foi criado com sucesso!");
				break;				
			
			case 2:
				System.out.println("Entre com o arquivo que deseja fazer a procura");
				Scanner sc5 = new Scanner(System.in);
				String arqv1 = sc5.nextLine();
				System.out.println("Digite o indice hash");
				Scanner sc6 = new Scanner(System.in);
				String hash1 = sc6.nextLine();
				RandomAccessFile r1 = new RandomAccessFile(arqv1,"r");
				RandomAccessFile f1 = new RandomAccessFile(hash1,"rw");
				System.out.println("Digite o CEP que deseja procurar");
				Scanner sc7 = new Scanner(System.in);
				long cep = sc7.nextLong();
				Hash.ler(f1, r1, cep);
				System.out.println("Se quiser procurar outro cep nesse arquivo digite 1, se não, 2");
				Scanner sc8 = new Scanner(System.in);
				conf = sc8.nextInt();
				while(conf == 1)
				{
					System.out.println("Digite o CEP desejado");
					sc7 = new Scanner(System.in);
					cep = sc7.nextLong();
					Hash.ler(f1, r1, cep);
					System.out.println("Se quiser procurar outro CEP nesse arquivo digite 1, se não, 2");
					sc8 = new Scanner(System.in);
					conf = sc8.nextInt();
				}
				break;							
		}		
	}
}
