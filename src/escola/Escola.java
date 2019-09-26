package escola;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;


public class Escola {
		
	static List<Aluno> listAlunos = new ArrayList<Aluno>();
	static int qtdNotas;

	public static boolean autenticar () {
		
		//validação do login para cadastrar o aluno
		Map<String, String> mapLogin = new HashMap<>();
		mapLogin.put("DIRETOR","3ndhuepq");
		mapLogin.put("PROFESSOR", "abc");
		mapLogin.put("SECRETARIA","jujuba");
		mapLogin.put("COORDENADOR","amor123");
		
		String login = JOptionPane.showInputDialog("Digite seu Login: ");

		if (!mapLogin.containsKey(login.toUpperCase())){
			JOptionPane.showMessageDialog(null,"login invalido");
			return false;
		}

		String senha = JOptionPane.showInputDialog("Digite sua senha: ");
		if (senha.equalsIgnoreCase(mapLogin.get(login.toUpperCase()))){
			JOptionPane.showMessageDialog(null, "Bem Vindo " + login);
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null,"senha invallida\n");
			return false;
		}



	}

	public static void perguntarQuantidadeNotas (){
		qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas a escola usa para calcular a media: "));
	}

	public static void realizarMatricula(){
		
		int cadastro = 0;
		
		do{
			Aluno aluno = new Aluno();
			aluno.setNome(JOptionPane.showInputDialog("Digite nome do aluno: "));
			aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite idade do aluno: ")));
			aluno.setQtdFaltas(Integer.parseInt(JOptionPane.showInputDialog("Digite quantidades de faltas do aluno: ")));
			
			String c = JOptionPane.showInputDialog("Digite escolaridade do aluno (1-FUNDAMENTAL, 2-MEDIO, 3-SUPERIOR): ");
			aluno.setEscolaridade(c);
			
			//aluno.setTrabalho(JOptionPane.showInputDialog("voce trabalha a noite? Digite sim ou nao"));
			aluno.setMedia(apontamentarNotas());
			
			
			// DICA: passagem do parametro aluno POR REFERENCIA
			avaliarResultado(aluno);
			
			
			listAlunos.add(aluno);
			
			
			/* DICA: OUTRA POSSIBILIDADE É CRIAR Aluno apenas no final
			Aluno aluno = new Aluno();
			
			aluno.incrementaIdade();
			aluno.imprimeCartaodeAniversario();
			
			aluno.setNome(nome);
			aluno.setIdade(idade);
			aluno.setQtdFaltas(qtdFaltas);
			aluno.setTrabalhaDeNoite(trabNoite == 1 ? true : false);
			aluno.setEscolaridade(escolaridade);
			aluno.setSituacao(situacao);			
			Double media = aluno.calcularMedia(soma,qtdNotas);			
			aluno.setMedia(media);
			aluno.setEscolaridade(avaliacao(media, qtdFaltas, aluno.isTrabalhaDeNoite()));						
			listAlunos.add(aluno);
			*/
			
			
			cadastro = JOptionPane.showConfirmDialog(null, "Você deseja cadastrar um novo aluno?");

		} while (cadastro == 0);

		return;
	}

	
	public static double apontamentarNotas(){
		
		double soma = 0;
		double notas = 0;
		
		for (int x = 1; x <= qtdNotas; x ++) {
			notas = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + x + "º nota: " ));
			soma += notas;
		}
		
		double media = soma/qtdNotas;
		
		return media;
	}


	public static void avaliarResultado(Aluno aluno){
		
		String status = "";
		
		if( aluno.getMedia() >= 9){
			status = "APROVADO";
		}
		else if(aluno.getMedia() >=4 && aluno.getQtdFaltas() < 10){
			status = "RECUPERAÇÃO";
		}
		else{
			status = "REPROVADO";
		}
		
		aluno.setStatus(status);

	}
	
	

	public static void exibirRelatorio() {  
		
		JOptionPane.showMessageDialog(null, "Click em ok para ver a lista de alunos");
		
		String p = ""; 
		for (int x = 0; x < listAlunos.size(); x++){
			p = p + "Nome: " + listAlunos.get(x).getNome() +"\nIdade: " + listAlunos.get(x).getIdade() +"\nMedia: " + listAlunos.get(x).getMedia() + "\nEscolaridade: "+ listAlunos.get(x).getEscolaridade()+"\nStatus: "+ listAlunos.get(x).getStatus() +"\n\n";
		} 
		
		JOptionPane.showMessageDialog(null, p);
	}




}
