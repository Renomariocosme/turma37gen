package vetoresematrizes;

import java.util.Scanner;

public class matrizquestão04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int valores[][] = new int[3][3];
		int l = 0, c = 0;
		int somaTotal = 0, somaDiagonal = 0;

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.println("\n Digite os valores da matriz: ");
				valores[l][c] = leia.nextInt();
			}

			for (l = 0; l < 3; l++) {
				for (c = 0; c < 3; c++) {
					somaTotal = somaTotal + valores[l][c];
				}

			}
			for (l = 0; l < 3; l++) {
				for (c = 0; c < 3; c++) {
					somaDiagonal = somaDiagonal + valores[l][c];

				}
			}

			System.out.println("a soma da diagonal é: " + somaDiagonal);
			System.out.println("a soma total é: " + somaTotal);
		}

	}
}