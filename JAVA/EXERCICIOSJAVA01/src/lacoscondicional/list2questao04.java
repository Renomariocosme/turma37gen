package lacoscondicional;

import java.util.Locale;
import java.util.Scanner;

public class list2questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
			double numero;
		
		System.out.println("Digite um valor inteiro positivo: ");
			numero = leia.nextInt();
	
	
	   if (numero<0) {
			System.out.println("\n Impossivel... n�mero negativo");
	}
	   else if(numero==0) {
		   System.out.println("\n 0 � um n�mero nulo!!!");
	   }
	   else if(numero%2==0) {
		   System.out.printf("\n O valor � par e sua raiz �: %.2f",Math.sqrt(numero));
	   }
	   else{
		   System.out.printf("\n O valor � impar e seu valor ao quadrado �: %.2f",Math.pow(numero,2));
	   }
	   
}}
