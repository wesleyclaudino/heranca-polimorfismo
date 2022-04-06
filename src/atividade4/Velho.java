package atividade4;

/**
 * @author Wesley Claudino Rodrigues - 0014950
 **/
public class Velho extends Imovel {
	private double desconto;

	// Método construtor com as RN's
	public Velho(double preco, double desconto) {
		// Inserindo uma taxa de 10% no preço
		this.setPreco(preco + (preco * desconto));
	}

	// Getters e Setters
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}