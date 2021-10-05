package lacoscondicional;

import java.util.Scanner;

public class atividade02questao03 {

	public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in);
	
			int idade;
			
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			
			if(idade>=18 && idade<=25) {
				System.out.println("Você é adulto ");
			}
			
			else if(idade>=10 && idade<=14) {
		System.out.println("Você é uma criança ");
	}

	else if(idade>=15 && idade<=17) {
	System.out.println("Você é juvenil ");
	}
	else if(idade<=10) {
				System.out.println("Não trabalhamos com essa idade...");
			}	
			
	} 
	
}