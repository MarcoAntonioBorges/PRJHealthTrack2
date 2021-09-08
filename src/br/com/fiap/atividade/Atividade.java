package br.com.fiap.atividade;

	/**
	 * Classe que seleciona uma atividade fisica
	 * @author Bruno Alessandro Mieli
	 * @version 1.0
	 */
public class Atividade {

	/**
	 * Nome da atividade fisica
	 */
	String atividadeFisica;
	
	/**
	 * descricao da atividade fisica
	 */
	String descricaoAtividade;
	
	/**
	 * quantidade de atividades selecionadas
	 */
	int qtdAtividade;
	
	public Atividade () {
		
	}
	
	/**
	 * Seleciona uma atividade na lista de atividades
	 * @param atividadeFisica uma atividade física
	 * @param descricaoAtividade descreve atividade selecionada
	 * @param qtdAtividade a quantidade de atividades
	 */
	public Atividade(String atividadeFisica, String descricaoAtividade, int qtdAtividade) {
		this.atividadeFisica = atividadeFisica;
		this.descricaoAtividade = descricaoAtividade;
		this.qtdAtividade = qtdAtividade;
	}
	
	/**
	 * Adiciona uma atividade a lista do usuário
	 * @param adicionar a atividade
	 */
	public void adicionarAtividade(String adicionar) {
	this.atividadeFisica = adicionar;
	}
	
	/**
	 * Remove uma atividade da lista do usuário
	 * @param remover a atividade
	 */
	public void removerAtividade(String remover) {
	this.atividadeFisica = remover;
	}
	
	/**
	 * Exibe as atividades praticadas pelo usuário
	 * @return para a lista de atividades do usuário
	 */
	public String consultarAtividade() {
	return this.atividadeFisica;
	}
	
}
