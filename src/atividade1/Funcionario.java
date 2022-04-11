package atividade1;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe de funcion�rio
public class Funcionario {
	private String nome;
	private int matricula;
	private float salario;

	// M�todo construtor
	public Funcionario() {}
	// M�todo construtor recebendo par�metros
	public Funcionario(String nome, int matricula, float salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}
	
	// M�todo para exibi��o de dados
	public String exibirDados() {
		return "Matr�cula : " + matricula + "Funcion�rio: " + nome;
	}
	
	// Getters e Setters
	protected float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
