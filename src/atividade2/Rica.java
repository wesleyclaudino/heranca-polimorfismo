package atividade2;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe rica
public class Rica extends Pessoa {
	private double dinheiro;
	
	// M�todo para o ato de fazer compras da classe Rica
	public void fazCompras() {
		System.out.println("Fazendo compras...");
		
	}

	public double getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
}