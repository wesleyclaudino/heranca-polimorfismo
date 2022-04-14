package atividade4;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
public class Imovel {
	private String endereco;
	private double preco = 200000;
	
	// Método para impressão do preço do imóvel
	public void imprimePreco() {
		System.out.println(getPreco());
	}

	// Getters e Setters
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}