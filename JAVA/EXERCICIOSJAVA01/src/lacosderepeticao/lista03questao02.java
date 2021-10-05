package lacosderepeticao;

import java.util.Scanner;
//atividade: Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR):


public class lista03questao02 {

	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
		
			int tPar=0,num,i,tImpar=0;
			
			for(i=1;i<=10;i++) {
				System.out.println("Digite um número: ");
				num = leia.nextInt();
				if(num%2==0) {
					tPar=tPar+1;
				} else if(num%2==1) {
					tImpar=tImpar+1;
				}
				
			}
			System.out.printf("Pares: %d\n",tPar);
			
			System.out.printf("Impares: %d",tImpar);
			System.out.printf("\n");
			
	}
		
}
