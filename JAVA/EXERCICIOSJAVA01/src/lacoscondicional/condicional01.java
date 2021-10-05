package lacoscondicional;
import java.util.Scanner;
public class condicional01 {
//laço repetição
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x,soma=0;
		
		for(x=1;x<=10;x++) {
			System.out.printf("\n %d",x);
			soma=soma+x;
		}
		System.out.printf("\nSoma total: %d",soma);
}}
