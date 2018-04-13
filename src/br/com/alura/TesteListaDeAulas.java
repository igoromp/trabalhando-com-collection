package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAulas {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Lista de Objetos", 19);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		
//		Formas de Comparação
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		
	}

}