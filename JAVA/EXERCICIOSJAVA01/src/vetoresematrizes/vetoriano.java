package vetoresematrizes;

import java.util.Scanner;
//LIST4QUESTAO01
public class vetoriano {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int v[]= {0,0,0,0,0};
		int maior=0;
		int i;
		
		for(i=0; i<5;i++) {
			System.out.println("Digite um número: ");
			v[i] = leia.nextInt();
			if(maior<v[i]) {
				maior= v[i];
			}
		}
		
		for(int i1=0;i1<5;i1++) {
			System.out.print(v[i1] + "\n");
		}	
		System.out.println("O maior número é: "+ maior);
		
	

}}
