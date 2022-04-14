package atividade3;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe de ingresso vip
public class Vip extends Ingresso {
	private double valorAdicional = getValorIngresso() / 5;
	private double valorVip = getValorIngresso() + this.valorAdicional;

	// Método para imprimir valor do ingresso vip
	public void imprimeValorIngresso() {
		System.out.println("R$ " + this.valorVip);
	}

	// Método de impressão do tipo do ingresso
	public void imprimirTipo() {
		System.out.print("Ingresso Vip");
	}

	// Getters e Setters
	public double getValorAdicional() {
		return this.valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public double getValorVip() {
		return this.valorVip;
	}

	public void setValorVip() {
		this.valorVip = this.getValorIngresso() + this.valorAdicional;
	}
}