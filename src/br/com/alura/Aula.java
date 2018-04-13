package br.com.alura;

public class Aula  implements Comparable<Aula>{
	private String titulo;
	private int tempo;
	
	
	public Aula(String aula, int tempo) {
		this.titulo = aula;
		this.tempo = tempo;
	};
	
	public String getTitulo() {
		return titulo;
	}	
	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "[Aula:" + titulo + ", " + tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
	
}
