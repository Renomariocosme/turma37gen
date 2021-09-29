programa
{
//VETORES - questao 01
    funcao inicio()
    {

		real numero[5], maior=0

        	para(inteiro i=0;i<5;i++){
            escreva("digite um valor: ")
            leia(numero[i])
            se(maior<numero[i]){
            maior = numero[i]

            }
    } 
            para(inteiro i=0;i<5;i++){

            escreva(numero[i] + "\n")
                    }
                    escreva("o maior numero é: "+ maior)
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 59; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */