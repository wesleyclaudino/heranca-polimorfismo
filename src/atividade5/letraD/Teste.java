package atividade5.letraD;

import java.util.Scanner;

import atividade3.CamaroteInferior;
import atividade3.CamaroteSuperior;
import atividade3.Ingresso;
import atividade3.Normal;
import atividade3.Vip;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Classe para teste da letra D da atividade 5
public class Teste {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ingresso ingresso = null;

		// Usuário digita o tipo desejado
		System.out.println("Digite o tipo de ingresso que deseja: ");
		System.out.println("1 - Ingresso Normal");
		System.out.println("2 - Ingresso Vip");
		int entrada = scan.nextInt();

		// Inicializando o ingresso pelo seu tipo
		switch (entrada) {
		case 1:
			ingresso = new Normal();
			break;
		case 2:
			System.out.println("Digite o tipo de ingresso Vip que deseja: ");
			System.out.println("1 - Camarote Superior");
			System.out.println("2 - Camarote Inferior");
			entrada = scan.nextInt();

			switch (entrada) {
			case 1:
				ingresso = new CamaroteSuperior();
				break;
			case 2:
				ingresso = new CamaroteInferior();
				break;
			}
			break;
		}

		// Imprimindo o tipo do ingresso
		ingresso.imprimirTipo();
		System.out.println(" escolhido.");
		
		// Imprimindo o valor do ingresso
		ingresso.imprimeValorIngresso();
	}
}