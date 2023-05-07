package pacotes;

import java.util.ArrayList;

public class Laboratorio   {
	
	private String nome;
	private int codTurma;
	ArrayList<Reservaa> Reservas;
	ArrayList<Professor> Professores;
	ArrayList<Turma> turmas;
	
	
//  get and seters
	void reservado () {}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodTurma() {
		return codTurma;
	}
	public void setCodTurma(int codTurma) {
		this.codTurma = codTurma;
	}
}
