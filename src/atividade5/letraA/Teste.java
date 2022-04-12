package atividade5.letraA;

import java.util.Scanner;

import atividade1.Assistente;
import atividade1.Tecnico;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Classe para teste da letra A da atividade 5
public class Teste {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Assistente assistente = new Assistente();
		
		// Usu�rio insere dados do assistente
		System.out.println("Insira o nome do assitente: ");
		assistente.setNome(scan.next());
		System.out.println("Insira a matr�cula do assitente: ");
		assistente.setMatricula(scan.nextInt());
		
		// Usu�rio insere dados do t�cnico
		Tecnico tecnico = new Tecnico();
		System.out.println("Insira o nome do t�cnico: ");
		tecnico.setNome(scan.next());
		System.out.println("Insira a matr�cula do t�cnico: ");
		tecnico.setMatricula(scan.nextInt());

		// Dados do assistente
		System.out.println("Dados do assistente: ");
		System.out.println("Nome: " + assistente.getNome());
		System.out.println("Matr�cula: " + assistente.getMatricula());
		
		// Dados do t�cnico
		System.out.println("Dados do t�cnico: ");
		System.out.println(tecnico.getNome());
		System.out.println(tecnico.getMatricula());
	}
}