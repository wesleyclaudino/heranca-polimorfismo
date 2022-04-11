package atividade1;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus André Pereira Góes
 **/
//Implementando a classe de funcionário
public class Funcionario {
	private String nome;
	private int matricula;
	private float salario;

	// Método construtor
	public Funcionario() {}
	// Método construtor recebendo parâmetros
	public Funcionario(String nome, int matricula, float salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}
	
	// Método para exibição de dados
	public String exibirDados() {
		return "Matrícula : " + matricula + "Funcionário: " + nome;
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
