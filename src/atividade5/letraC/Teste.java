package atividade5.letraC;

import java.util.Scanner;

import atividade2.Miseravel;
import atividade2.Pessoa;
import atividade2.Pobre;
import atividade2.Rica;
import exceptions.EscolhaException;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Classe para teste da letra C da atividade 5
public class Teste {
	public static void main(String[] args) throws EscolhaException {
		Scanner scan = new Scanner(System.in);
		Pessoa pessoa = null;

		// Escolha do tipo de pessoa
		System.out.println("1- Pessoa Rica");
		System.out.println("2- Pessoa Pobre");
		System.out.println("3- Pessoa Miserável");
		int escolha = scan.nextInt();

		// O que é feito na semana pela pessoa
		switch (escolha) {
			case 1:
				pessoa = new Rica();
				pessoa.fazNaSemana();
				break;
			case 2:
				pessoa = new Pobre();
				pessoa.fazNaSemana();
				break;
			case 3:
				pessoa = new Miseravel();
				pessoa.fazNaSemana();
				break;
			default:
				throw new EscolhaException("A escolha requerida não existe");
		}
	}
}