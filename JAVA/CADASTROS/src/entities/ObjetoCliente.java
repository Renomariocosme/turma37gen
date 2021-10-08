package entities;

public class ObjetoCliente {

	public String nome;
	public String cpf;
	public char pronome;
	public int idade;
	
	
		public ObjetoCliente (int idade,String cpf) {
			
			this.idade=idade;
			this.cpf=cpf;
			
		}
		
		public ObjetoCliente (int idade,String cpf,char pronome,String nome) {
			
			
			this.idade=idade;
			this.cpf=cpf;
			this.pronome=pronome;
			this.nome=nome;
			
		}
			public ObjetoCliente() {
				
			}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public char getPronome() {
			return pronome;
		}

		public void setPronome(char pronome) {
			this.pronome = pronome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
	
		
}    
			
