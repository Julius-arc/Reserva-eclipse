package pacotes;

import java.util.ArrayList;

public class Professor {
	
	private String nome;
	private int matricula;
	
	
	ArrayList<Reservaa> Reservas;
	ArrayList<Laboratorio> Laboratorios;
	ArrayList<Turma> turmas;
	void reservar () {
		
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
