package atividade2;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe rica
public class Rica extends Pessoa {
	private double dinheiro;

	// Método para o ato de fazer compras da classe Rica
	public void fazCompras() {
		System.out.println("Fazendo compras...");

	}

	// Método para o que faz na semana
	public void fazNaSemana() {
		fazCompras();
	}

	// Getters e Setters
	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
}