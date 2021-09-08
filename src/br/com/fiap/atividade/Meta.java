package br.com.fiap.atividade;

/**
 * Classe que define metas para a execu��o das atividades
 * @author Bruno Mieli
 * @version 1.0
 */

public class Meta {

	/**
	 * Grau de intensidade dos exerc�cios
	 */
	String intensidade;
	
	/**
	 * o tipo de modalidade do b�sico ao avan�ado
	 */
	String modalidade;

	public Meta () {
		
	}
	
	/**
	 * auxilia o us�ario a praticar exerc�cios conforme o n�vel de intensidade.
	 * @param intensidade grau de intensidade
	 * @param modalidade tipo de modalidade
	 */
	public Meta(String intensidade, String modalidade) {
		this.intensidade = intensidade;
		this.modalidade = modalidade;
	}
	
	/**
	 * o ato de incluir/definir uma modalidade/intensidade
	 * @param incluir 
	 */
	public void incluir (String incluir) {
		this.intensidade = incluir;
		this.modalidade = incluir;
	}
	
	/**
	 * Alterar a intensidade conforme pretende aumentar ou diminuir o seu ritmo 
	 * @param alterar
	 */
	public void alterar (String alterar) {
		this.intensidade = alterar;
		this.modalidade = alterar;
	}
	/**
	 * consultar a meta escolhida
	 * @return
	 */
	public String consultarMeta() {
		return this.intensidade;
	}
	
}
