package pacotejava;

//ATIVIDADE01QUESTAO01 :Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias
//
import java.util.Scanner;

public class entradasaida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leia = new Scanner(System.in);
	String  nome;
	int  anoNascimento;
	int  diaNascimento;
	int  mesNascimento;
	int anoAtual;
	int mesesVividos;
	int diasVividos;
	System.out.println("Digite seu nome: ");
	nome = leia.next();
	System.out.println("Qual o ano você nasceu: ");
	anoNascimento = leia.nextInt();
	System.out.println("Qual o mês você nasceu: ");
	mesNascimento = leia.nextInt();
	System.out.println("Qual o dia você nasceu: ");
	diaNascimento = leia.nextInt();
	System.out.println("Qual o ano atual: ");
	anoAtual = leia.nextInt();
	
			
	mesesVividos=(anoAtual+anoNascimento * 12+mesNascimento);
	diasVividos=mesesVividos*30;
	
	System.out.println("Esse é seu total de dias vividos " + diasVividos);
	
	
	
	
	}

}
