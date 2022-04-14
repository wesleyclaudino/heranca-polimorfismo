package atividade5.letraE;

import java.util.Scanner;

import atividade4.Imovel;
import atividade4.Novo;
import atividade4.Velho;
import exceptions.EscolhaException;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Classe para teste da letra E da atividade 5
public class Teste {
	public static void main(String[] args) throws EscolhaException {
		Scanner scan = new Scanner(System.in);
		Imovel imovel = null;
		
		// Usu�rio decide que im�vel deseja
		System.out.println("Que tipo de im�vel deseja?");
		System.out.println("1 - Im�vel Novo");
		System.out.println("2 - Im�vel Velho");
		int entrada = scan.nextInt();
		
		// Instancia��o do tipo de im�vel
		switch(entrada) {
		case 1:
			imovel = new Novo();
			break;
		case 2:
			imovel = new Velho();
			break;
		default:
			throw new EscolhaException("A escolha requerida n�o existe");
		}
		
		// Imprimindo valor final do im�vel
		System.out.println("Valor do im�vel escolhido: ");
		imovel.imprimePreco();
	}
}