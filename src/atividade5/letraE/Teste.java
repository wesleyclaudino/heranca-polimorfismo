package atividade5.letraE;

import java.util.Scanner;

import atividade4.Imovel;
import atividade4.Novo;
import atividade4.Velho;
import exceptions.EscolhaException;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Classe para teste da letra E da atividade 5
public class Teste {
	public static void main(String[] args) throws EscolhaException {
		Scanner scan = new Scanner(System.in);
		Imovel imovel = null;
		
		// Usuário decide que imóvel deseja
		System.out.println("Que tipo de imóvel deseja?");
		System.out.println("1 - Imóvel Novo");
		System.out.println("2 - Imóvel Velho");
		int entrada = scan.nextInt();
		
		// Instanciação do tipo de imóvel
		switch(entrada) {
		case 1:
			imovel = new Novo();
			break;
		case 2:
			imovel = new Velho();
			break;
		default:
			throw new EscolhaException("A escolha requerida não existe");
		}
		
		// Imprimindo valor final do imóvel
		System.out.println("Valor do imóvel escolhido: ");
		imovel.imprimePreco();
	}
}