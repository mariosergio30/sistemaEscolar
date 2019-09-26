package escola;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void incrementarIdade(int ano) {

		this.idade = idade + ano;
	}
	
	
	public abstract void imprimeCartaodeAniversario();

}
