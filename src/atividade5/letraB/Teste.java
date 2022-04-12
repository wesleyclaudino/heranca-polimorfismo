package atividade5.letraB;

import atividade2.Animal;
import atividade2.Cachorro;
import atividade2.Gato;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
// Classe para teste da letra B da atividade 5
public class Teste {
	public static void main(String[] args) {
		Animal animal = null;
		
		// Cachorro latindo e caminhando
		System.out.println("Cachorro: ");
		animal = new Cachorro();
		animal.comunica();
		System.out.println(animal.caminha());
		
		// Gato miando e caminhando
		System.out.println("Gato: ");
		animal = new Gato();
		animal.comunica();
		System.out.println(animal.caminha());
	}
}