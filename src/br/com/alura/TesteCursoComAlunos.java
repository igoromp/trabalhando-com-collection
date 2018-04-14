package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TesteCursoComAlunos {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as Colecoes", "Paulo Silveira");		

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma Aula",20));
		javaColecoes.adiciona(new Aula("Modelando com coleções",23));
		
		Aluno a1 = new Aluno ("Igor Oliveira",34987);
		Aluno a2 = new Aluno ("Danielle Izidia",201621);
		Aluno a3 = new Aluno ("Emanuelle Izidia",56987);
		Aluno a4 = new Aluno ("Alberto Roberto",21452);
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		javaColecoes.matricular(a4);
		
		System.out.println("Todos Alunos:");
		javaColecoes.getAlunos().forEach(aluno->{
			System.out.println("-> "+aluno);
		});
		
		System.out.println("O aluno "+a1.getNome()+" está matriculado");
		System.out.println(javaColecoes.hasAluno(a1));
		
//		Simulação de busca
		String nome = "Igor Oliveira";		
		Aluno igor = new Aluno(nome,34987);
		System.out.println("(obj)a1 é equals ao (obj)igor ? "+ a1.equals(igor));
		System.out.println("Existe o aluno "+igor.getNome()+"? "+ javaColecoes.hasAluno(igor));
		
		/*
		 * Se a1.equals(igor) é true
		 * Obrigatoriamente o hasCode deve ser true
		 * a1.hashCode() == turini.hashCode()
		 * 
		 * Logo, caso se sobreescreva o equals voce deve reescrever o hashCode
		 */
		
//		Modelo Antigo de Iteração
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		
		while(iterator.hasNext()){
			Aluno next = iterator.next();
			System.out.println(next);
		}
	}
}
