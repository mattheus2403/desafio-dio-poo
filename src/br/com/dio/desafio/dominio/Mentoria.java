package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	//calcula xp e adiciona + 20
	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}

	//atributos
	private LocalDate data;
	
	//construtor
	public Mentoria() {

	}

	//get e set
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	//toString
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}

}
