package app;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import entities.Carrinho;
import entities.FormaPagamento;
import entities.Produto;

public class application {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println(" >> LOJA << ");
		Produto p1 = new Produto("Mouse", "G0-0", 20, 10);
		Produto p2 = new Produto("TECLADO  ", "G6-1 ", 150.00 , 20);
		Produto p3 = new Produto("MONITOR ", "G6-2 ", 1500.00 , 30);
		Produto p4 = new Produto("CABO USB", "G6-3",20.00, 30);
		Produto p5 = new Produto("FONE DE OUVIDO", "G6-4", 50.00, 10);
		Produto p6 = new Produto("CARREGADOR", "G6-5", 40.00, 10);
		Produto p7 = new Produto("ADAPTADOR", "G6-6", 25.00, 10);
		Produto p8 = new Produto("PELÍCULA", "G6-7", 20.00,10);
		Produto p9 = new Produto("CABO HDMI", "G6-8", 40.00, 10);
		Produto p10 = new Produto("CASE P/ CELULAR", "G6-9",30.00,10);
		FormaPagamento f1 = new FormaPagamento(0, 0, 0, 0, 0);
		int formaPagamento = 0;
		double valorTotalCompra = 0.0;
		double valorParcelado = 0.0;
		double valorComImposto = 0.0;
		double valorComDesconto = 0.0;
		char respostaBoleto;
		char proximoPasso;
		char respostaIndecisa;
		
		
		
		Carrinho c1 = new Carrinho(null, null, 0, 0, 0, 0);
		
		
		Produto l[]  = new Produto[10];
		//Livro[] l = new Livro[3];
		
		l[0] = p1;
		l[1] = p2;
		l[2] = p3;
		l[3] = p4;
		l[4] = p5;
		l[5] = p6;
		l[6] = p7;
		l[7] = p8;
		l[8] = p9;
		l[9] = p10;
		
		for(int y =0;y<9;y++) {
			System.out.println(l[y]);
		}
		
		//l[0] = new Livro("ainda da", "Cortella", 110, p[1]);
		//l[1] = new Livro("a vida n é util", "Krenak", 75, p[0]);
		//l[2] = new Livro("java", "alguem", 450, p[1]);
		
		//l[0].abrir();
		//l[0].folhear(100);
		//l[0].avancarPg();
		
		
		
		//System.out.println(l[0].detalhes());
		//System.out.println(l[1].detalhes());
		
		//Map<Integer, Produto> produto = new HashMap<Integer, Produto>();
			
		 //Set<Integer> keySet= produto.keySet();
		//for(int i: keySet){
	     //   System.out.println(produto.get(i));
	   // }
		
		
		int auxCompra;
		int y=0;
		char op;
		
		System.out.println("Gostaria de comprar ?");
		op = leia.next().toUpperCase().charAt(0);
		if ( op == 'S') {
			char resp = 'S';
			do {
			 
		
		System.out.println("Digite o numero do produto: ");
		 y=leia.nextInt();
			
		System.out.println(l[y].getProduto() + " " + l[y].getCodigo() + " " + l[y].getValor() + " " + l[y].getEstoque());
		
		System.out.println("Digite a quantidade: ");
		auxCompra=leia.nextInt();
		
		l[y].comprar(auxCompra);
		double auxvalor =l[y].getValor();
		int auxestoque = l[y].getEstoque();
		
		if(auxCompra<= l[y].getEstoque() && auxCompra>0 && l[y].getEstoque()>=0)  {
		c1.compra(auxCompra,auxvalor,auxestoque);
		System.out.println(l[y].getProduto() + " " + l[y].getCodigo() + " " + l[y].getValor() + " " + l[y].getEstoque());
		}else {
			System.out.println("Sem Sucesso");
			
			
		}
		System.out.println("Gostaria de continuar comprando? ");
		resp = leia.next().toUpperCase().charAt(0);
	} while (resp == 'S');
			
	
			
		
		
		
	
		
		System.out.println(l[y].getProduto() + " " + l[y].getCodigo() + " " + l[y].getValor() + " " + l[y].getEstoque());
		System.out.println("Carrinho: " +c1.getEstoqueCarrinho()+ "x " + " valor "+c1.getValorCarrinho());
		
		}
		else {
			System.out.println("Agradeçemos a preferencia!");
		}
		f1.setValorTotalCompra(c1.getValorCarrinho());
		System.out.print("\n____________________\n");
		System.out.print("\n DIGITE 1 PARA PAGAMENTO À VISTA\n");
		System.out.print("____________________\n");
		System.out.print("\n DIGITE 2 PARA PAGAMENTO EM CARTÃO\n");
		
		formaPagamento=leia.nextInt();
		
		
		System.out.print("\n >>> PARA PAGAMENTOS À VISTA VOCÊ GANHA 10% DE DESCONTO!! <<<\n");
		System.out.print("____________________\n");
		System.out.print("\n VALOR TOTAL DA COMPRA: R$"+ (valorTotalCompra)+"\n");
		System.out.print("____________________\n");
		System.out.print("\n DESEJA GERAR O BOLETO PARA O PAGAMENTO? (S/N) ");
		respostaBoleto=leia.next().charAt(0);
		
		System.out.print("\n\n______________________\n");
		System.out.print("\nNUMERO DO BOLETO: 3654684561468465486846846878646000000064\n");
		System.out.print("____________________\n");
		System.out.print("\n\nPROSSEGUIR PARA EMISSÃO DE NOTA FISCAL? ");
		proximoPasso = leia.next().charAt(0);
		
		System.out.print("\n >> COMPRA REALIZADA COM SUCESSO! << ");
		System.out.print("\n	\n___________\n");
		System.out.print("\n 	NOTA FISCAL: 216546454654");
		System.out.print("\n___________\n");
		
		System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
		
		System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
		System.out.print("\nDESEJA VOLTAR AO MENU DE COMPRAS? ");
		respostaIndecisa = leia.next().charAt(0);
		f1.getFormaPagamento(respostaBoleto,proximoPasso ,respostaIndecisa);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}