package entities;

import java.util.Scanner;

public class FormaPagamento {
Scanner leia = new Scanner (System.in);
	public FormaPagamento(int formaPagamento, double valorTotalCompra, double valorParcelado, double valorComImposto,
			double valorComDesconto) {
		super();
		this.formaPagamento = formaPagamento;
		this.valorTotalCompra = valorTotalCompra;
		this.valorParcelado = valorParcelado;
		this.valorComImposto = valorComImposto;
		this.valorComDesconto = valorComDesconto;
	}
	private int formaPagamento = 0;
	private double valorTotalCompra = 0.0;
	private double valorParcelado = 0.0;
	private double valorComImposto = 0.0;
	private double valorComDesconto = 0.0;
	private char respostaBoleto;
	private char proximoPasso;
	private char respostaIndecisa;
	
	public int getFormaPagamento(char respostaBoleto2, char proximoPasso2, char respostaIndecisa2) {
		return formaPagamento;
	}
	public void setFormaPagamento(int formaPagamento) {
		this.formaPagamento = formaPagamento;
	
	}
	public double getValorTotalCompra() {
		return valorTotalCompra;
	
	}
	public void setValorTotalCompra(double valorTotalCompra) {
		this.valorTotalCompra = valorTotalCompra;
	}
	
	public double getValorParcelado() {
		return valorParcelado;
	
	}
	public void setValorParcelado(double valorParcelado) {
		this.valorParcelado = valorParcelado;
	
	}
	public double getValorComImposto() {
		return valorComImposto;
	
	}
	public void setValorComImposto(double valorComImposto) {
		this.valorComImposto = valorComImposto;
	
	}
	public double getValorComDesconto() {
		return valorComDesconto;
	
	}
	public void setValorComDesconto(double valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	
	}
	
	
	

	public void formaPagamento(double valorTotalCompra ,char respostaBoleto, char proximoPasso ,char respostaIndecisa) {
		
		System.out.print("\n____________________\n");
		System.out.print("\n DIGITE 1 PARA PAGAMENTO À VISTA\n");
		System.out.print("____________________\n");
		System.out.print("\n DIGITE 2 PARA PAGAMENTO EM CARTÃO\n");
		this.formaPagamento=leia.nextInt();
		
		if(formaPagamento == 1){
			valorComDesconto = valorTotalCompra - (valorTotalCompra * 10)/100;
			valorTotalCompra = valorComDesconto;
			System.out.print("\n >>> PARA PAGAMENTOS À VISTA VOCÊ GANHA 10% DE DESCONTO!! <<<\n");
			System.out.print("____________________\n");
			System.out.print("\nVALOR TOTAL DA COMPRA: R$"+(valorTotalCompra)+"\n");
			System.out.print("____________________\n");
			System.out.print("\nDESEJA GERAR O BOLETO PARA O PAGAMENTO? (S/N) ");
			respostaBoleto=leia.next().charAt(0);
			if(respostaBoleto =='S' || respostaBoleto == 's'){
				
				System.out.print("\n\n______________________\n");
				System.out.print("\nNUMERO DO BOLETO: 36546845614684654868468468786460000000 64\n");
				System.out.print("____________________\n");
				System.out.print("\n\nPROSSEGUIR PARA EMISSÃO DE NOTA FISCAL? ");
				proximoPasso = leia.next().charAt(0);
				
					if(proximoPasso == 's' || proximoPasso == 'S'){

						System.out.print("\n >> COMPRA REALIZADA COM SUCESSO! << ");
						System.out.print("\n\n___________\n");
						System.out.print("\nNOTA FISCAL: 216546454654");
						System.out.print("\n___________\n");
					}
					else if(proximoPasso == 'n' || proximoPasso == 'N'){
						System.out.print("\n >>> OBRIGADE PELA PREFERÊNCIA <<<\n");
					}
					else if (proximoPasso != 's' || proximoPasso != 'S' || proximoPasso != 'n' || proximoPasso != 'N'){
						System.out.print("\nDESCULPE, OPÇÃO INVÁLIDA!");
						System.out.print("\nDESEJA VOLTAR AO MENU DE COMPRAS? ");
						respostaIndecisa = leia.next().charAt(0);
					}
			}	
	}
}
	}
		
	
	
	