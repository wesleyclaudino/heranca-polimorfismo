package atividade1;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe de t�cnico
public class Tecnico extends Assistente{
	// M�todo para inser��o de b�nus salarial
	public String bonusSalarial(float bonus) {
		return getNome() + " Recebeu um bonus de: " + bonus +
				"\n Ficando com: " + ( getSalario() + bonus );
	}
}