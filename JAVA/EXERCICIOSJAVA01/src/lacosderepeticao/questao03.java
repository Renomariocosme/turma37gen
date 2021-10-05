package lacosderepeticao;

import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a =0,menor=0,maior=0;
		
		while(a!=-99) {
			System.out.println("Digite a idade (Caso deseje parar, digite -99)");
			a = leia.nextInt();
			if(a<21 && a>0) {
				menor++;
			}
			
			else if((a==0 || a <0) && a!=-99) {
				System.out.println("Você digitou um número inválido!");
				
			}
			if(a>50) {
				maior++;
			}
		}
		System.out.println("Quantidade de pessoas acima de 50: "+maior);
		System.out.println("Quantidade de pessoas abaixo de 21 anos: "+menor);

}}
