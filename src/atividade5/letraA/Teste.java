package atividade5.letraA;

import java.util.Scanner;

import atividade1.Assistente;
import atividade1.Tecnico;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 * **/
public class Teste {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Assistente assistente = new Assistente();
		System.out.println("Insira o nome do assitente: ");
		assistente.setNome(scan.next());
		System.out.println("Insira a matrícula do assitente: ");
		assistente.setMatricula(scan.nextInt());
		Tecnico tecnico = new Tecnico();
		System.out.println("Insira o nome do técnico: ");
		tecnico.setNome(scan.next());
		System.out.println("Insira a matrícula do técnico: ");
		tecnico.setMatricula(scan.nextInt());

		// Dados do assistente
		System.out.println("Dados do assistente: ");
		System.out.println("Nome: " + assistente.getNome());
		System.out.println("Matrícula: " + assistente.getMatricula());
		
		// Dados do técnico
		System.out.println("Dados do técnico: ");
		System.out.println(tecnico.getNome());
		System.out.println(tecnico.getMatricula());
	}
}