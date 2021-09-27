programa
{
	//atividade 4
	funcao inicio()
	{
		cadeia nome
		inteiro n

		escreva("Digite o nome da pessoa: ")
		leia(nome)
		escreva("Digite um numero positivo: ")
		leia(n)

		se(n==0){
				escreva(nome,", você digitou um número neutro!!")
			}

		senao se (n<0){
		escreva(nome,", voce digitou um numero negativo!!")
				}

		senao se(n%2==0){
		escreva(nome,", seu numero é par!!")
					}
		senao{
		escreva(nome,", seu número é impar!!")
						}
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 25; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */