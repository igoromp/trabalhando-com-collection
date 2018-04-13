package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteandoListas {

	public static void main(String[] args) {
		String aula3= "Conhecendo mais de listas";
		String aula2= "Modelando a Classe aula";
		String aula1= "Trabalhando com  Cursos e Sets";
		String aula4= "Aumentando nossos conhecimentos";
		
		List<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		System.out.println(aulas);	
		aulas.remove(0);
		imprimirAulas(aulas);
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula :"+ primeiraAula);
		
//		Lambda
		aulas.forEach(aula ->{
			System.out.println("Pecorrendo..."+ aula);
			});
		
		Collections.sort(aulas);		
		System.out.println(aulas);
		
	}

	
	public static void imprimirAulas( List<String> aulas) {
		for (String aula : aulas) {
			System.out.println(aula);
		}
	}
}
