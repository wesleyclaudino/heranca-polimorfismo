package atividade1;

/**
 * @author Wesley Claudino Rodrigues
 * @author Matheus Andr� Pereira G�es
 **/
//Implementando a classe de administrativo
public class Administrativo extends Assistente {
	private String turno;
	
	// Implementando regras de neg�cio
	public String adicionalNoturno( int horas ) {
		return "\nAdicional Noturno: " + horas 
		+ "\nTurno: " + this.turno;
	}

	// Getters e Setters
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
}
