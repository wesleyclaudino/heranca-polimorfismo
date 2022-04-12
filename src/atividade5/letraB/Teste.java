package atividade5.letraB;

import java.util.Scanner;

import atividade1.Assistente;
import atividade1.Tecnico;
import atividade2.Animal;
import atividade2.Cachorro;
import atividade2.Gato;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
// Classe para teste da letra b da atividade 5
public class Teste {
	public static void main(String[] args) {
		Animal animal = null;
		
		// Cachorro latindo...
		System.out.println("Cachorro: ");
		animal = new Cachorro();
		animal.comunica();
		
		// Gato miando...
		System.out.println("Gato: ");
		animal = new Gato();
		animal.comunica();
	}
}