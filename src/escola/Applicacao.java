package escola;


public class Applicacao {

	public static void main(String[] args) {
		
		
		
		// Nome de Métodos devem indicar uma açãos, assim normalmente são iniciados por um VERBO		
		if(Escola.autenticar()) {
			
			Escola.perguntarQuantidadeNotas();
						
			Escola.realizarMatricula();
			
			Escola.exibirRelatorio();			
		}
		
	
		
	}

}
