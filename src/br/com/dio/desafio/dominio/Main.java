package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		//cria novo curso
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Descricao curso java");
		curso1.setCargaHoraria(7);
		
		//cria novo curso
		Curso curso2 = new Curso();
		curso2.setTitulo("JavaScript");
		curso2.setDescricao("Descricao curso javascript");
		curso2.setCargaHoraria(4);
		
		//cria mentoria
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);

		//cria novo bootcamp
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Santander Bootcamp Java");
		bootcamp.setDescricao("Descrição Bootcamp Java");
//		bootcamp.getConteudos().add(curso1);
//		bootcamp.getConteudos().add(curso2);
//		bootcamp.getConteudos().add(mentoria);
//		
		//cria novo dev
		Dev devMattheus = new Dev();
		devMattheus.setNome("Matheus");
		devMattheus.inscreverBootcamp(bootcamp);	
		System.out.println("Conteudos Inscritos do " + devMattheus.getNome() + ": " + devMattheus.getConteudosInscritos());
		devMattheus.progredir();
		System.out.println("---");
		System.out.println("Conteudos Inscritos do " + devMattheus.getNome() + " Após Progredir: " + devMattheus.getConteudosInscritos());
		System.out.println("Conteudos Concluidos do Matheus: " + devMattheus.getConteudosConcluidos());
		System.out.println("XP: " + devMattheus.calcularTotalXp());
		
		System.out.println("\n----------------- \n");
		
		//cria novo dev
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos da " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("---");
		System.out.println("Conteudos Inscritos da " + devCamila.getNome() + " Após Progredir: " + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos da Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
	}

}
