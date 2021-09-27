programa
{
	//atividade lista3 - enquanto questao 01 enquanto
	funcao inicio()
	{
		//Elaborar um programa que efetue a Leitura sucessiva...


	//variaveis
	inteiro valorDigitado=0
	real media=0.00
	inteiro total=0
	real totalValoresDigitados=0.00
	
	//entradas
	enquanto (valorDigitado>=0){
	escreva("Digite um numero positivo ou negativo para parar: ")
	leia(valorDigitado)
	//total += valorDigitado
	total = total + valorDigitado
	totalValoresDigitados++
	
	
	
	
		
	}
	

	//processamentos
	media = total / totalValoresDigitados
	//saidas
	escreva("\nQuantidade de valores digitados: ", totalValoresDigitados)
	escreva("\nSomatorio de valores digitados:  ",totalValoresDigitados)
	escreva("\nMédia de valores digitados:    ", media)
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 61; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */