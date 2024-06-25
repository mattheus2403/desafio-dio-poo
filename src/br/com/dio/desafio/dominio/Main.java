package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Java");
		curso1.setDescricao("Descricao curso java");
		curso1.setCargaHoraria(7);
		
		System.out.println(curso1);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Descricao curso javascript");
		curso2.setCargaHoraria(4);
		
		System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(mentoria1);
		
	}

}
