programa
{
							//QUESTÃO04//
// Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
//e em seguida, exiba a soma dos valores dela e a soma dos valores da 
//primeira diagonal, ou seja, diagonal principal...
    funcao inicio()
    {
        inteiro valores [3][3]
        inteiro l=0,c=0
        inteiro somaTotal=0,somaDiagonal=0



        para(l=0;l<2;l++){
            para (c=0;c<2;c++){
            	escreva("\n Digite os valores da matriz:  ")
            	leia(valores[l][c])
            	
            } 
            
         		para(l=0;l<2;l++){
         			para(c=0;c<2;c++){
         				somaTotal=somaTotal+valores[l][c]
         				}
        		
        		
        		para(l=0;l<2;l++){
        			para (c=0;c<2;c++){
        				somaDiagonal=somaDiagonal+valores[l][c]
        				}
						
        			
        		} escreva("A soma total da matriz foi: ", somaTotal)
        		  escreva("A soma da diagonal é: ", somaDiagonal)
		
        }
            
        } 
        
        
		
        }
    }

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 541; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */