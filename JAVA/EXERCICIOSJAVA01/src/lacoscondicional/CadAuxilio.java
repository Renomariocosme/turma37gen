package lacoscondicional;

import java.util.Locale;
import java.util.Scanner;

public class CadAuxilio {

	public static void main(String[] args) {
		//VARIAVEIS
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		String nome;
		char pronome;
		boolean chefaFamilia=false;
		boolean naoOutroAuxilio=false;
		final double AUXILIO=600.00;
		final double VALORFILHO=50.00;
		char op;
		int filhos;
		
		//ENTRADAS
		leia.nextLine(); //limpa o teclado
		System.out.println("Digite o nome da pessoa");
		nome = leia.nextLine();
		System.out.println("Digite o pronome tratamento A/O/E");
		pronome = leia.next().toUpperCase().charAt(0);
		System.out.println("Chefa de familia S/N?");
		op = leia.next().toUpperCase().charAt(0);
		
		if(op=='S') {
			chefaFamilia = true;
			
		}
		System.out.println("Já recebeu outro auxilio: ");
		op = leia.next().toUpperCase().charAt(0);
		
		if(op=='S') {
			naoOutroAuxilio=false;
		}
		System.out.println("Quantidade de filhos: ");
		filhos = leia.nextInt();
		
		
		if(chefaFamilia && naoOutroAuxilio) {
			System.out.printf("Olá Sr%c vai receber de auxilio %.2f, mais %.2f dos filhos(s)",pronome,(AUXILIO*2)(VALORFILHO*filho));
			
			
		}
		else if (naoOutroAuxilio) {
			System.out.println("");
		}
		
				
	}

}
