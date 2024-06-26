package br.com.dio.desafio.dominio;

public abstract class Conteudo {

	//atributos
	private String titulo;
	private String descricao;
	//constante
	final protected static double XP_PADRAO = 10;
	
	//método abstrato que calcula xp
	public abstract double calcularXP();
	
	//getters e setters
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		
}
