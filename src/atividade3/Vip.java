package atividade3;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe de ingresso vip
public class Vip extends Ingresso {
	private double valorAdicional;
	private double valorVip;
	
	// Método para imprimir valor do ingresso vip
	public void imprimeValorIngresso(){
		System.out.println(this.valorVip);
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