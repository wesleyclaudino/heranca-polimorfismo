package atividade3;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe de camarote superior
public class CamaroteSuperior extends Vip {
	String assento;
	double valorAdicionalCS;
	double valorCamaroteSuperior;

	// Método para impressão do valor do ingresso
	public void imprimirValorIngresso() {
		System.out.println(this.getValorIngresso());
	}
	// Método para impressão do valor do ingresso com os valores adicionais
	public void imprimirValorCS() {
		System.out.println(this.valorCamaroteSuperior);
	}

	// Método para imprimir o assento comprado
	public void imprimirAssento() {
		System.out.println(this.assento);
	}

	// Getters e Setters
	public String getAssento() {
		return this.assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}
	
	public double getValorAdicionalCS() {
		return this.valorAdicionalCS;
	}
	public void setValorAdicionalCS(double valorAdicionalCS) {
		this.valorAdicionalCS = valorAdicionalCS;
	}
	
	public double getValorCamaroteSuperior() {
		return this.valorCamaroteSuperior;
	}
	public void setValorCamaroteSuperior(double valorCamaroteSuperior) {
		this.valorCamaroteSuperior = this.getValorVip() + this.valorAdicionalCS;
	}
}