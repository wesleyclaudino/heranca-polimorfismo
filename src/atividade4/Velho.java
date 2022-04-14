package atividade4;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
public class Velho extends Imovel {
	private double desconto = getPreco() / 10;
	
	// Método construtor com as RN's
	public Velho() {
		// Inserindo uma taxa de 10% no preço
		this.setPreco(this.getPreco() - this.desconto);
	}

	// Getters e Setters
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}