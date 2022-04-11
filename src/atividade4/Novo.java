package atividade4;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
public class Novo extends Imovel {
	private double taxa;

	// M�todo construtor com as RN's
	public Novo(double preco, double taxa) {
		// Inserindo uma taxa de 10% no pre�o
		this.setPreco(preco + (preco * taxa));
	}

	// Getters e Setters
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
}