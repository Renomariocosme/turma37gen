programa
{
	//atividade 6°
	funcao inicio()
	{
		inteiro idade
		escreva("Qual a sua idade: ")
		leia(idade)	

		se(idade>18){
			escreva("Adultos")
			}
		
	 	se(idade>=5 e idade<7){
			escreva(" Turma infantil A ")
		
		}
		senao se(idade>=8 e idade<11){
			escreva(" Turma infantil B")
		}
		senao se(idade>=12 e idade<13){
			escreva(" Turma Juvenil A")
			}
		senao se(idade>=14 e idade<17){
			escreva(" Turma juvenil B")
			}		
		
		se (idade<4) {
			escreva(" Não trabalhamos com essa idade ")
			}
				
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */