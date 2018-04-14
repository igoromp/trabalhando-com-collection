package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection <String> alunos = new HashSet<String>();
		
//		SETs são muito mais rápidos em buscar os dados do que Lists
		alunos.add("Igor Oliveira");
		alunos.add("Alberto Roberto");
		alunos.add("Nicola Tesla");
		alunos.add("Nicola Tesla");
		alunos.add("Segio Maquina");
		alunos.add("André Maquina");
		
		boolean IgorHasMatriculado = alunos.contains("Igor Oliveira");
		alunos.remove("Nicola Tesla");
		System.out.println("Igor está matriculado? "+IgorHasMatriculado);
		
		alunos.forEach(aluno->{
			System.out.println(aluno);
		});
		System.out.println(alunos);
		
		Collection <String> alunosEmLista = new ArrayList<String>(alunos);
		alunosEmLista.forEach(aluno->{
			System.out.println(aluno);
		});
	}

}
