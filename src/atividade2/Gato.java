package atividade2;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe gato
public class Gato extends Animal {
	// Método de miar do gato
	public void mia() {
		System.out.println("Miau! Miau!");
	}

	// Método e comunicação do gato
	public void comunica() {
		mia();
	}
}