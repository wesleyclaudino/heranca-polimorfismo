package atividade4;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
public class Velho extends Imovel {
	private double desconto = getPreco() / 10;
	
	// M�todo construtor com as RN's
	public Velho() {
		// Inserindo uma taxa de 10% no pre�o
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