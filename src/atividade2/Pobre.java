package atividade2;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe pobre
public class Pobre extends Pessoa {
	// M�todo para o ato de trabalhar do pobre
	public void trabalha() {
		System.out.println("Trabalhando...");
	}
	
	// M�todo para o que faz na semana
	public void fazNaSemana() {
		trabalha();
	}
}