package projeto1;

import java.util.ArrayList;
import java.util.Collection;

public class testeLista {

	public static void main(String[] args) {
		
		
		Collection<String> produto = new ArrayList();
		
		produto.add("MONITOR");
		produto.add("Mouse");
		produto.add("Teclado");
		produto.add("Cabo USB");
		produto.add("Carregador");
		produto.add("Fone de ouvido");
		produto.add("Case p/ NTB");
		produto.add("SUPORTE p/ NTB");
		
		System.out.println("Os produtos são: "+ produto);
		
	}
}
