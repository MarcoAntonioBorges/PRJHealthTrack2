package br.com.fiap.atividade;

/**
 * Classe que analisa o resultado do cliente para que possa obter um feedback dos seus exercícios
 * @author Bruno Mieli
 * @version 1.0
 */
public class Resultado {

	/**
	 * Análise do resultado
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
	 * O sistema conclui a análise
	 * @param concluir
	 */
	public void concluir(String concluir) {
	this.analiseResultado = concluir;	
	}
	
	/**
	 * Sistema exibe se o desempenho foi antingido ou não
	 * @param exibir
	 */
	public String exibirResultado() {
	return this.analiseResultado;
		
	}
}
