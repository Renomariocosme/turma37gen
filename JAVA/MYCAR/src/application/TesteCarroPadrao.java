package application;

import entities.Carro;

public class TesteCarroPadrao {

	public static void main(String[] args) {

		
		Carro carro1 = new Carro("PLX-0203","CELTA","GM");
		Carro carro2 = new Carro();	

		
		carro1.ligarCarro();
		carro1.andarCarro();
		System.out.println("marcha: "+carro1.getMarcha()+"velocidade"+carro1);
		carro1.subirMarcha();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		System.out.println("marcha: "+carro1.getMarcha()+"velocidade"+carro1);
		carro1.subirMarcha();
		for(int x=1;x<10;x++) {
			carro1.acelerar();
		}
		
		System.out.println("marcha: "+carro1.getMarcha()+"velocidade"+carro1);

		for(int x=1;x<5;x++) {
			carro1.reduzir();
		}
		
		for(int x=1;x<5;x++) {
			carro1.descerMarcha();
			
		}
		
		
}}		
