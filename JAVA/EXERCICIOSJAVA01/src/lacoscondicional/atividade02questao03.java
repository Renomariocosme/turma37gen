package lacoscondicional;

import java.util.Scanner;

public class atividade02questao03 {

	public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in);
	
			int idade;
			
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			
			if(idade>=18 && idade<=25) {
				System.out.println("Voc� � adulto ");
			}
			
			else if(idade>=10 && idade<=14) {
		System.out.println("Voc� � uma crian�a ");
	}

	else if(idade>=15 && idade<=17) {
	System.out.println("Voc� � juvenil ");
	}
	else if(idade<=10) {
				System.out.println("N�o trabalhamos com essa idade...");
			}	
			
	} 
	
}