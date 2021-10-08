package app;

import entities.ObjetoCliente;


public class Cliente {

	public static void main(String[] args) {
		
		
	//	Scanner leia = new Scanner(System.in);
		
		ObjetoCliente n1 = new ObjetoCliente(20,"111-111-111.56",'O',"PAULO");
		
		/*System.out.println("Digite seu nome: ");
		String nome = leia.next();
		System.out.println("Digite o seu CPF: ");
		String cpf=leia.next();
		System.out.println("Digite sua idade:");
		int idade=leia.nextInt();
		System.out.println("1 - Masculino, 2 - Feminina , 3 - Neutre");
		char  op = leia.next().charAt(0);
		*/
		/*if (op=='1') {
            n1.pronome = 'o';
        } else if (op=='2') {
            n1.pronome = 'a';
        } else {
            n1.pronome = 'e';
        }
		*/
		
		System.out.printf("As informações do cliente são:\n Nome: %s\n Idade: %d\n CPF: %s\n Pronome: %c\n",
				n1.nome,n1.idade,n1.cpf,n1.pronome);
		
		
		
	}

}
