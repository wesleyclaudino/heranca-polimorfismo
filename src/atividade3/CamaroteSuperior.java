package atividade3;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe de camarote superior
public class CamaroteSuperior extends Vip {
	String assento;
	double valorAdicionalCS = getValorVip() / 2;
	double valorCamaroteSuperior = getValorVip() + this.valorAdicionalCS;

	// M�todo de impress�o do tipo do ingresso vip
	public void imprimirTipo() {
		super.imprimirTipo();
		System.out.print(" - Camarote Superior");
	}

	// M�todo para impress�o do valor do ingresso
	public void imprimeValorIngresso() {
		System.out.println("R$ " + this.valorCamaroteSuperior);
	}

	// M�todo para impress�o do valor do ingresso com os valores adicionais
	public void imprimirValorCS() {
		System.out.println(this.valorCamaroteSuperior);
	}

	// M�todo para imprimir o assento comprado
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