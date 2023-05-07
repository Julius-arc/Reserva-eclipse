package pacotes;

import java.util.ArrayList;

public class Turma  {
	
	private int idturma;
	private String curso;
	private String periodo;
	private String	turno;
	
	 ArrayList<Turma> turmas;
	 ArrayList<Reservaa> Reservas;
	 ArrayList<Professor> Professores;
	 ArrayList<Laboratorio> Laboratorios;


	//  get and seters
	 
	 public int getIdturma() {
			return idturma;
		}
		public void setIdturma(int idturma) {
			this.idturma = idturma;
		}
	 
	 public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;}
	
	
	}
	
	
	
	
		
	
		
	
	
