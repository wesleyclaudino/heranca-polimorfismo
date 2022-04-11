package atividade1;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe de assistente
public class Assistente extends Funcionario {
	// Método para exibição de dados
	public String exibirDados() {
		return "Matrícula" + getMatricula()
				+ "Assistente: " + getNome();
	}
}