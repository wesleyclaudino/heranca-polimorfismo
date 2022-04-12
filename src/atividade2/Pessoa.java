package atividade2;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe pessoa
public class Pessoa {
	private String nome;
	private int idade;

	// Regra de negócio para a inicialização do objeto com valores iniciais para os atributos
	public Pessoa() {
		this.setNome("Nome não definido!");
		this.setIdade(0);
	}
	
	public void fazNaSemana() {};

	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}