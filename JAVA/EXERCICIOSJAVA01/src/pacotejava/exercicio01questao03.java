package pacotejava;

import java.util.Scanner;

//  ATIVIDADE 3 Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos
public class exercicio01questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int horas= 0,minutos= 0,segundos= 0;
		System.out.print("Digite a dura��o do evento em segundos: ");
		segundos = leia.nextInt();
		
		horas=(segundos/3600);
		minutos=((segundos % 3600)/60);
		
		segundos=((segundos % 3600) % 60 );
		
		System.out.println ("A dura��o do evento �: "+ horas +"horas"+minutos+"minutos e "+segundos+"segundos"  );
		
		
		
		
			
		
	}

}
