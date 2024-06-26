package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

	//atributos
	private int cargaHoraria;
	
	//construtor
	public Curso() {
		
	}
	
	//calcula xp e adiciona multiplica pela carga horária
	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
	
	//getters and setters
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	//toString
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
}
