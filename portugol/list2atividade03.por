programa
{         //atividade 7
	inclua biblioteca Matematica
	//Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	//(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	funcao inicio()
	{
		inteiro base, altura, area
		base = 0
		altura = 0

		escreva("Qual o valor da base: ")
		leia(base)
		escreva("Qual o valor da altura: ")
		leia(altura)

		se(base>0 e altura>0){
			escreva("Valor afirmativo!!\n")
			area=(base*altura)/2
			escreva("A area do triangulo é de: ", area)
			
			}
		senao{
			escreva("Valor negativo!!!")
				
				}
				 
					
					}
		{
			
			
		}

		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */