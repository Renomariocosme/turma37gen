package pacotejava;

import java.util.Scanner;

public class atividade01questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		
		int idade,anos,meses,dias;
		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();
		anos = dias/365;
		meses = (dias%365)/30;
		dias = (dias%365)%30;
		System.out.println("Você tem "+ anos + "anos"+ meses+"meses"+ dias+"dias");
		
		
	
	}

}
