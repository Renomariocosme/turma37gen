package lacosderepeticao;

import java.util.Scanner;

public class exemploCadaluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		
		String nome[] = new String[4]; //0-3
		int nota[] = {0,0,0,0};
		char disciplinaNota[] = new char[4];
		String disciplina[] = {"1 - MATEMATICA","2-PORTUGUES","3-CIENCIAS","4-ARTES"};
		
		
		for (int x=0; x<4;x++) {
			System.out.println("Digite o nome do aluno: ");
			nome[x] = leia.next();
			
			System.out.println("Digite o código da disciplina");
			disciplinaNota[x] = leia.next().charAt(0);
			System.out.println("Digite a nota de"+ disciplina[x]);
			nota[x] =  leia.nextInt();
		}
		
		
	
	
	
	}

}
