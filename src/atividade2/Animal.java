package atividade2;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe animal
public class Animal {
	private String nome;
	private String raca;

	// Regra de neg�cio para a inicializa��o do objeto com valores iniciais para os atributos
	public Animal() {
		this.nome = "Nome n�o definido!";
		this.setRaca("Raca n�o definida!");
	}
	// M�todo construtor recebendo par�metro
	public Animal( String nome ) {
		this.nome = nome;
	}
	
	// M�todo de caminhada do animal
	public String caminha() {
		return !this.nome.equals("Nome n�o definido!") ? this.nome + "caminhando..." : "caminhando...";
	}
	
	// M�todo de comunica��o do animal
	public void comunica() {};
	
	// Getters e Setters
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
}
