package atividade2;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe animal
public class Animal {
	private String nome;
	private String raca;

	// Regra de negócio para a inicialização do objeto com valores iniciais para os atributos
	public Animal() {
		this.nome = "Nome não definido!";
		this.setRaca("Raca não definida!");
	}
	// Método construtor recebendo parâmetro
	public Animal( String nome ) {
		this.nome = nome;
	}
	
	// Método de caminhada do animal
	public String caminha() {
		return !this.nome.equals("Nome não definido!") ? this.nome + "caminhando..." : "caminhando...";
	}
	
	// Método de comunicação do animal
	public void comunica() {};
	
	// Getters e Setters
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
}
