package br.com.fiap.atividade;

/**
 * Classe que analisa o resultado do cliente para que possa obter um feedback dos seus exerc�cios
 * @author Bruno Mieli
 * @version 1.0
 */
public class Resultado {

	/**
	 * An�lise do resultado
	 */
	String analiseResultado;
	
	public Resultado () {
		
	}
	
	/**
	 * O sistema analisa o desempenho do cliente
	 * @param analiseResultado
	 */
	public Resultado(String analiseResultado) {
	this.analiseResultado = analiseResultado;
	}
	
	/**
	 * O sistema conclui a an�lise
	 * @param concluir
	 */
	public void concluir(String concluir) {
	this.analiseResultado = concluir;	
	}
	
	/**
	 * Sistema exibe se o desempenho foi antingido ou n�o
	 * @param exibir
	 */
	public String exibirResultado() {
	return this.analiseResultado;
		
	}
}
