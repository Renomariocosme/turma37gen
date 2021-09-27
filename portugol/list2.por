programa
{
	//atividade 2°
	funcao inicio()
	{
		//variaveis
		const real VALORHORANORMAL=10.00
		const real VALORHORAEXTRA=20.00
		const inteiro HORASNORMAIS=50
		
		cadeia C
		inteiro N=0
		real salario=0.00
		inteiro E=0.00
		real salarioTotal=0.00
		real salarioExcedente=0.00
		//entradas
		escreva("Digite o código do funcionário: ")
		leia(C)
		escreva("Digite o numero de horas trabalhadas: ")
		leia(N)
		//processamentos
		se (N > HORASNORMAIS){
			E=N - HORASNORMAIS
			salario = HORASNORMAIS * VALORHORANORMAL
			salarioExcedente = E * VALORHORAEXTRA
			salarioTotal = salario + salarioExcedente
			}
		senao {
			salario = N * VALORHORANORMAL
			}
		//saidas
		escreva("FOLHA DE PAGAMENTO")
		escreva("\nSalario            R$: ",salario)
		escreva("\nNumero em hora extra :", E)
		escreva("\nSalario excedente R$ : ", salarioExcedente)
		escreva("\nSalario Total     R$ : ", salarioTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 906; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */