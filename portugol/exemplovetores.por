programa
{
	//vetor - É uma variavel composta podendo nela armazenar vários valores.
	funcao inicio()
	{
		//*ela armazena dados
		//*em varias posições
		inteiro numero[4], x
		//usando "para", para determinar valores
		para(x=0;x<4;x++)
		{
			escreva("Entre com um número: ")//Aqui ele leu o valor de X que foi digitado
			leia(numero[x])
		}
		para(x=0;x<4;x++){//Atribuição do laço para iniciar mediante a posição que foi escolhida

			escreva(" \nValor posição ", x+1,": ", numero[x])
			
		}
		para(x=3;x>=0;x--){//aqui foi testado o inverso, começando de tras pra frente
			//em uma posição que antecede o valor final do vetor
			
			escreva(" \nValor posição ", x+1,": ", numero[x])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */