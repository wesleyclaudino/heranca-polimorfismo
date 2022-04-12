package atividade2;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe pessoa
public class Pessoa {
	private String nome;
	private int idade;

	// Regra de neg�cio para a inicializa��o do objeto com valores iniciais para os atributos
	public Pessoa() {
		this.setNome("Nome n�o definido!");
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