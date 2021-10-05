package lacosderepeticao;

import java.util.Scanner;

public class laçorepeticao {

	public static void main(String[] args) {
		
		Scanner ler  = new Scanner(System.in);
	
		int idade;
		String nome;
		
		System.out.printf("Entre com a sua idade:");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.println("Entre com seu nome: ");
		nome = ler.nextLine();
		System.out.printf("\nSeu nome: %s",nome);
		System.out.printf("\nSua idade: %d",idade);
		
		//entradas
		
		if(idade>=18) {
			System.out.printf("\nVocê é maior de idade...");
			
		}
		else if(idade>=1 && idade<18) {
			System.out.printf("\nVocê é menor de idade...");

		}
		else {
			System.out.printf("\nVocê entrou com uma idade não aceita...");

		}
	
	
	}

}
