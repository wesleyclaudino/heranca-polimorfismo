package atividade3;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe de ingresso
public class Ingresso {
	private double valorIngresso = 50;

	// Método para exibição do valor do ingresso
	public void imprimeValorIngresso() {
		System.out.println("R$ " + this.valorIngresso);
	}

	// Método de impressão do tipo do ingresso
	public void imprimirTipo() {};

	// Getters e Setters
	public double getValorIngresso() {
		return this.valorIngresso;
	}

	public void setValorIngresso(Double valor) {
		this.valorIngresso = valor;
	}
}