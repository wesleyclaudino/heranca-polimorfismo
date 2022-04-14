package atividade3;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe de camarote inferior
public class CamaroteInferior extends Vip {
	String assento;
	
	// M�todo de impress�o do tipo do ingresso vip
		public void imprimirTipo() {
			super.imprimirTipo();
			System.out.print(" - Camarote Inferior");
		}
	
	// M�todo para imprimir o assento
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
}