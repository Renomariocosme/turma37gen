package application;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
//TRY CATCH explica��o
		
		Scanner leia = new Scanner(System.in);
		int opc;
		
		System.out.println("Digite o tipo de conta a ser trabalha: ");
		System.out.println("1-Conta poupan�a \n2- Conta corrente \n3-Conta empresa \n4-Conta Estudantil \n5- Conta Especial ");
		opc = leia.nextInt();
		
		if (opc == 1) {
			System.out.println("Fazendo conta poupan�a....");
		
			
		} else if (opc == 2) {
			System.out.println("Conta corrente....");
		}
	
	
	
	
	}

}
