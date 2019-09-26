package escola;

import escola.Aluno.Escolaridade;

public final class Aluno extends Pessoa{
	
	enum Escolaridade {		
		FUNDAMENTAL, MEDIO, SUPERIOR		
	}
	
	private double media;
	private String status;
	private String trabalho;
	private int qtdFaltas;
	private Escolaridade escolaridade;

	public double getMedia() {
		return media;
	}
	
	public void setMedia(double media) {
		this.media = media;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}


	public String getTrabalho() {
		return trabalho;
	}
	
	public void setTrabalho() {
		this.trabalho = trabalho;
	}
	
	public int getQtdFaltas() {
		return qtdFaltas;
	}
	
	public void setQtdFaltas(int qtdFaltas) {
		this.qtdFaltas = qtdFaltas;
	}
	
	public Escolaridade getEscolaridade() {
		return escolaridade;
	}
	
	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	
	public void setEscolaridade(String c) {
		
		switch (c) {
		case "1" : 
			this.escolaridade = Escolaridade.FUNDAMENTAL;
			return;
		case "2" : 
			this.escolaridade = Escolaridade.MEDIO;;
			return;
		case "3" : 
			this.escolaridade = Escolaridade.SUPERIOR;
			return;
		}
		
	}

	
	@Override
	public void imprimeCartaodeAniversario() {
		// TODO Auto-generated method stub
		
		System.out.println("Caro Aluno " + this.getNome() + " do ensino " + this.escolaridade +  " PARABÉNS pelo seu aniversário !");
		
	}




}