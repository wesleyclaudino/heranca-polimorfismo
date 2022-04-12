package atividade2;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe cachorro
public class Cachorro extends Animal {
	// Método de latir do cachorro
	public void late() {
		System.out.println("Au! Au!");
	}
	
	// Método e comunicação do cachorro
	public void comunica() {
		late();
	}
}