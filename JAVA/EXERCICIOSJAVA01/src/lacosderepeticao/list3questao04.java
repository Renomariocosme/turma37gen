package lacosderepeticao;

import java.util.Scanner;

public class list3questao04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// variaveis
		int idade = 0;
		char sexo = 0; // (1-feminino / 2-masculino / 3-Outros)
		char opcao = 0; // (1, pessoa calma; 2,pessoa nervosa ,pessoa agressiva
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosasAcima40Anos = 0;
		int pessoasCalmasMenos18Anos = 0;
		char op = 'S';
		int contadorHabitantes = 0;

		// entradas
		while (op == 'S' && contadorHabitantes < 150) {
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			System.out.print("Escolha \n1-feminino  \n2-masculino  \n3-Outros");
			sexo = leia.next().charAt(0);
			System.out.println("Escolha (\n1-pessoa calma\n 2-pessoa nervosa\n 3-pessoa agressiva\n");
			opcao = leia.next().charAt(0);
			System.out.println("Continua S OR N? :");
			op = leia.next().toUpperCase().charAt(0);
			contadorHabitantes++;
			if (opcao == '1') {
				pessoasCalmas++;
			}
			if (sexo == '1' && opcao == '2') {
				mulheresNervosas++;
			}
			// processamento
		}
		if (sexo == '2' && opcao == '3') {
			homensAgressivos++;
		}
		if (sexo == '3' && opcao == '1') {
			outrosCalmos++;
		}
		if (opcao == '2' && idade > 40) {
			pessoasNervosasAcima40Anos++;
		}
		if (opcao == '1' && idade < 18) {
			pessoasCalmasMenos18Anos++;
		}
		// saidas
		System.out.println("Habitantes entrevistado  : " + (contadorHabitantes - 1));
		System.out.println("Pessoas calmas           :" + pessoasCalmas);
		System.out.println("Mulheres nervosas        :" + mulheresNervosas);
		System.out.println("Homens agressivo         :" + homensAgressivos);
		System.out.println("Outros calmos			 :" + outrosCalmos);
		System.out.println("Pessoas nervosas acima 40 anos: " + pessoasNervosasAcima40Anos);
		System.out.println("Pessoas calmas menos de 18: " + pessoasCalmasMenos18Anos);

		

	}

}
