package atividade3;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe de ingresso
public class Ingresso {
	private double valorIngresso;
	
	// M�todo para exibi��o do valor do ingresso
	public void imprimeValorIngresso() {
		System.out.println(this.valorIngresso);
	}
	
	// Getters e Setters
	public double getValorIngresso() {
		return this.valorIngresso;
	}
	public void setValorIngresso(Double valor) {
		this.valorIngresso = valor;
	}
}