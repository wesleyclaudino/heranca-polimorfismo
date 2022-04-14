package atividade4;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
public class Novo extends Imovel {
	private double taxa = getPreco() / 10;
	
	// Método construtor com as RN's
	public Novo() {
		// Inserindo uma taxa de 10% no preço
		this.setPreco(this.getPreco() + this.taxa);
	}

	// Getters e Setters
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
}