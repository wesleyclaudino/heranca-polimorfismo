package atividade1;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe de assistente
public class Assistente extends Funcionario {
	// M�todo para exibi��o de dados
	public String exibirDados() {
		return "Matr�cula" + getMatricula()
				+ "Assistente: " + getNome();
	}
}