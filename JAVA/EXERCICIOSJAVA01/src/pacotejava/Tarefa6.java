package pacotejava;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //Padroniza em EUA
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		
		double d;
		double x2,x1,y1,y2;
		
		System.out.print("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.print("Digite o valor x2: ");
		x2 = leia.nextDouble();
		System.out.print("Digite o valor y1: ");
		y1 = leia.nextDouble();
		System.out.print("Digite o valor x2: ");
		y2 = leia.nextDouble();
		d=Math.sqrt(Math.pow((x2-x1),2.00)+Math.pow((y2-y1),2));
		
		//processamentos
		
		
		
		//saida
		 System.out.printf("Valor de d é %.2f",d);
		
		

	}

}
