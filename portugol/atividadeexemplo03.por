programa
{
	
	funcao inicio()
	{
		
		cadeia nome
		inteiro nota=0
		inteiro totalNotas=0
		real media=0.00
		inteiro maiorNota=0
		inteiro menorNota=10
		inteiro contadorMenorNota=0
		
		//contador
		//totalizador
		//comparação - inversão
		
		escreva("Qual o seu nome: ")
		leia(nome)
		para(inteiro x=1; x<=4; x++){
			escreva("Digite a nota ",x,": ")
		leia(nota)
		totalNotas = totalNotas + nota
		se(nota > maiorNota){
			maiorNota = nota
			}
		
		{
			
			}
		
		
		

			}
		media = totalNotas /4.00
		escreva("Oi "," Sua média de notas foi ",media)
		escreva("Sua maior nota foi",maiorNota,"\n")
		escreva("      FIM")

		

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 450; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */