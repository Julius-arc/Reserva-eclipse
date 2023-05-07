package school;

import pacotes.Turma;


import java.util.Date;

import pacotes.Laboratorio;
import pacotes.Professor;
import pacotes.Reservaa;


public class AssociandoTudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Turma ads=new Turma();
		ads.setCurso("ads");
		ads.setPeriodo("terceiro");
		ads.setTurno("noite");
		ads.setIdturma(123123);
		
		
		Laboratorio laboratorio1 = new Laboratorio() ;
		laboratorio1.setNome  ("LabApple");
		laboratorio1.setCodTurma  (1);
		
		
		
		
		
		
		Professor profADS=new Professor();
		profADS.setMatricula(1);
		profADS.setNome("Claudinha");
		
		Reservaa primeira= new Reservaa();
		primeira.setDay(new Date ());
		primeira.setCodReserva(123);
		primeira.setID(2);
		primeira.setTurno("noite");
		primeira.setProfessor(profADS);
		primeira.setTurma(ads);
		
		 
		System.out.println("curso: " + ads.getCurso());
		System.out.println("professor: " + profADS.getNome());
		System.out.println("dia: " + primeira.getDay());
		System.out.println("laboratorio> " + laboratorio1.getNome());
	
		
	}

}
