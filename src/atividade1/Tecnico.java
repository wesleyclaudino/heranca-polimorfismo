package atividade1;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe de técnico
public class Tecnico extends Assistente{
	// Método para inserção de bônus salarial
	public String bonusSalarial(float bonus) {
		return getNome() + " Recebeu um bonus de: " + bonus +
				"\n Ficando com: " + ( getSalario() + bonus );
	}
}