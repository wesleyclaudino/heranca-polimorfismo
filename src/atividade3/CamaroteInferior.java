package atividade3;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe de camarote inferior
public class CamaroteInferior extends Vip {
	String assento;
	
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