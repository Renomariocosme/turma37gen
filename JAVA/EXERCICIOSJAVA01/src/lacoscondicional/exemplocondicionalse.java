package lacoscondicional;

import java.util.Scanner;

public class exemplocondicionalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		
		final int ANO_ATUAL = 2021;
		String nome="EPAMINONDAS";
		int anoNascimento;
		int idade;
		char pronome;
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite o ano do nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.print("Qual o pronome A/O/E");
		idade = ANO_ATUAL - anoNascimento;
		pronome = leia.next().toUpperCase().charAt(0);
		if(idade >=40) {
			System.out.print("Você é cringe!!");
			
		} else if(idade>=18 && pronome =='A') {
			System.out.print("Você é adulte!!");
		}
		else {
			System.out.print("Você é jovem!!");
		}
		
		switch (pronome) {
		case 'A':{
			System.out.println("Pronome feminino");
		}
		} 
		
		
		//&& - e ||  - ou != não ou diferente
		
		System.out.println(nome.toLowerCase());
	}

}
