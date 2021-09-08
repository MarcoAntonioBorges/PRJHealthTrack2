package br.com.fiap.atividade;

public class Teste {
	
	public static void main(String[] args) {
	
	Cliente cadastro = new Cliente();
	cadastro.nome = "Bruno";
	cadastro.cpf = "394.441.438-13";
	cadastro.idade = 24;
	cadastro.altura = 1.9f;
	cadastro.peso = 100;
	cadastro.email = "bruno.a.mieli@icloud.com";
	
	cadastro.incluir("cadastro inclu�do com sucesso!");
	System.out.println(cadastro.consultar());
	
	cadastro.excluir("cadastro exclu�do.");
	System.out.println(cadastro.consultar());
	
		
	Atividade exercicio = new Atividade();
	exercicio.atividadeFisica = "abdominal";
	exercicio.descricaoAtividade = "Fortalece o abdomem";
	exercicio.qtdAtividade = 1;
	
	exercicio.adicionarAtividade("Atividade adicionada a sua lista de exerc�cios com sucesso!");
	System.out.println(exercicio.consultarAtividade());
	
	exercicio.removerAtividade("Atividade removida da sua lista de exercicios.");
	System.out.println(exercicio.consultarAtividade());
	
	Meta define = new Meta();
	define.intensidade = "Cliente escolhe qual seu objetivo de treino";
	define.modalidade = "Iniciante, Regular, Alto, Avan�ado";
	
	define.incluir("Meta inclu�da com sucesso!");
	System.out.println(define.consultarMeta());
	
	Resultado feedback = new Resultado();
	feedback.analiseResultado = "Conclus�o dos exerc�cios praticados semanal e mensalmente";
	
	feedback.concluir("Parab�ns! A meta foi atingida");
	System.out.println(feedback.exibirResultado());
	
	feedback.concluir("A meta n�o foi atingida por pouco.");
	System.out.println(feedback.exibirResultado());
			
	}
}
