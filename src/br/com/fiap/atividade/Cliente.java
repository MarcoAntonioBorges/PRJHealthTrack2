package br.com.fiap.atividade;

import java.io.Serializable;

/**
 * Classe que cadastro o cliente no aplicativo
 * @author Bruno Mieli
 * @version 1.0
 */
public class Cliente implements Serializable {

	/**
	 * Nome do cliente
	 */
	String nome;
	
	/**
	 * Cadastro de pessoa física
	 */
	String cpf;
	
	/**
	 * idade do cliente
	 */
	int idade;
	
	/**
	 * Altura do cliente
	 */
	float altura;
	
	/**
	 * Peso do cliente
	 */
	float peso;
	
	/**
	 * e-mail, correio eletrônico
	 */
	String email;
	
	public Cliente() {
		
	}

	/**
	 * dados para o cadastro
	 * @param nome
	 * @param cpf
	 * @param idade
	 * @param altura
	 * @param peso
	 * @param email
	 */
	public Cliente(String nome, String cpf, int idade, float altura, float peso, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.email = email;
	}
	
	/**
	 * inclusão do cadastro no banco de dados do aplicativo (String)
	 * @param incluir
	 */
	public void incluir(String incluir) {
		this.cpf = incluir;
		this.nome = incluir;
		this.email = incluir;
	}
	
	/**
	 * inclusão do cadastro de número inteiros
	 * @param incluir
	 */
	public void incluir(int incluir) {
		this.idade = incluir;
	}
	
	/**
	 * Inclusao de dados do tipo float
	 * @param incluir
	 */
	public void incluir(float incluir) {
		this.altura = incluir;
		this.peso = incluir;
	}
	
	/**
	 * excluir dados de cadastro
	 * @param excluir
	 */
	public void excluir(String excluir) {
		this.cpf = excluir;
		this.nome = excluir;
		this.email = excluir;
	}
	
	/**
	 * excluir dados de cadastro
	 * @param excluir
	 */
	public void excluir(int excluir) {
		this.idade = excluir;
	}
	
	/**
	 * excluir dados de cadastro
	 * @param excluir
	 */
	public void excluir(float excluir) {
		this.altura = excluir;
		this.peso = excluir;
	}
	
	/**
	 * Consultar os dados já cadastrados do usuário no sistema
	 * @return
	 */
	public String consultar() {
		return this.cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
