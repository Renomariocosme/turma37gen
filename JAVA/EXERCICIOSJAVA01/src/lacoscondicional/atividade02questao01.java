package lacoscondicional;

import java.util.Scanner;

// 1° Faça um programa que receba três inteiros e diga qual deles é o maior.

public class atividade02questao01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int N1;
		int N2;
		int N3;
		
		System.out.println("Digite um numero: ");
		N1= ler.nextInt();
		System.out.println("Digite um numero: ");
		N2= ler.nextInt();
		System.out.println("Digite um numero: ");
		N3= ler.nextInt();
		
		if (N1>N2 && N1>N3) {
			System.out.println("O maior numero é: "+N1);
		}
		if (N1<N2 && N2<N3) {
			System.out.println("O maior numero é: "+N2);
		}
		if (N3>N1 && N3>N2) {
			System.out.println("O maior numero é: "+N3);
		}
		
		else {
			
		}
		
		
		
			
	
	}

}
