package lacosderepeticao;

import java.util.Scanner;

public class lacowhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade;
		System.out.printf("\n Entre com a sua idade: ");
		idade = leia.nextInt();
		
		do { 
			
			
			System.out.printf(" \n Sua idade é %d",idade);
			if(idade>=18) {
				System.out.printf(" \n Você é de maior",idade);

			}
			else {
				System.out.printf("\n Você é de menor",idade);

			}
			System.out.printf("\n Entre com sua idade: ");
			idade = leia.nextInt();
		} while(idade>=1);
	}

}
