package pacotes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Reservaa  {
	
	
	private Professor professor;
	private Turma turma;
	private int codReserva ;
	private int ID;
	private String turno;
	private Date day;
	private LocalDateTime dataRerservada;
	
	ArrayList<Laboratorio> Laboratorios;
	ArrayList<Professor> Professores;
	ArrayList<Reservaa> turmas;
		
	
//  get and seters
	
	public int getCodReserva() {
		return codReserva;
	}
	public void setCodReserva(int codReserva) {
		this.codReserva = codReserva;
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public LocalDateTime getDataRerservada() {
		return dataRerservada;
	}
	public void setDataRerservada(LocalDateTime dataRerservada) {
		this.dataRerservada = dataRerservada;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
