package escola;


public class Applicacao {

	public static void main(String[] args) {
		
		
		
		// Nome de M�todos devem indicar uma a��os, assim normalmente s�o iniciados por um VERBO		
		if(Escola.autenticar()) {
			
			Escola.perguntarQuantidadeNotas();
						
			Escola.realizarMatricula();
			
			Escola.exibirRelatorio();			
		}
		
	
		
	}

}
