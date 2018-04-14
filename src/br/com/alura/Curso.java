package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();
	private Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();
	
	
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
//		return aulas;
//		Retornando com programação Defencisa
		return Collections.unmodifiableList(aulas);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}
	
	
	public void adiciona(Aula aula){
		this.aulas.add(aula);
	}
	
	
	public int getTempoTotal() {
		int tempoTotal =0;		
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}		
		return tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso=" + nome + ", Tempo Total:"+ this.getTempoTotal()+"]";
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(),aluno);
	}

	public boolean hasAluno(Aluno aluno) {		
		return this.alunos.contains(aluno);
	}

	public Aluno buscarMatricula(int matricula) {
		if(!this.matriculaParaAluno.containsKey(matricula))
			throw new NoSuchElementException("Aluno "+ matricula+" não encontrado");
		return matriculaParaAluno.get(matricula);
		//throw new NoSuchElementException("matricula não encontrada:"+matricula);
	}
	
	
}
