package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as Colecoes",
				"Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 23));

		Aluno a1 = new Aluno("Igor Oliveira", 34987);
		Aluno a2 = new Aluno("Danielle Izidia", 201621);
		Aluno a3 = new Aluno("Emanuelle Izidia", 56987);
		Aluno a4 = new Aluno("Alberto Roberto", 21452);

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		javaColecoes.matricular(a4);

		System.out.println("Quem é o aluno com matricula 201621?");
		Aluno aluno = javaColecoes.buscarMatricula(201621);
		System.out.println(aluno);

	}

}
