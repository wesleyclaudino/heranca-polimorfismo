package atividade2;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe pobre
public class Pobre extends Pessoa {
	// Método para o ato de trabalhar do pobre
	public void trabalha() {
		System.out.println("Trabalhando...");
	}
	
	// Método para o que faz na semana
	public void fazNaSemana() {
		trabalha();
	}
}