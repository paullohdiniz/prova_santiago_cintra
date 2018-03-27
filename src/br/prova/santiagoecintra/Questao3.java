package br.prova.santiagoecintra;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Questao3 {
	
	private static Map<String, Integer> nomePessoaQuant;

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		nomePessoaQuant = new HashMap<String, Integer>();
		
		//Exemplo de entrada: { “Pedro”, “João”, “Maria”, “JOAO”, “Alberto”, “João”, “MARiA” } 
		
		list.add("Pedro");
		list.add("João");
		list.add("Maria");
		list.add("JOAO");
		list.add("João");
		list.add("MARiA");
		
		contaOrdenaPessoas(list);

	}

	private static Map<String, Integer> contaOrdenaPessoas(List<String> list) {
		list.replaceAll(String::toUpperCase);
		
		java.util.Collections.sort(list);
			
		String nomeAnt = "";
		int count = 1;
		
		for (String nome : list) {
			
			nome = Normalizer.normalize(nome, Normalizer.Form.NFD);
			nome = nome.replaceAll("[^\\p{ASCII}]", "");
			
			if(nomeAnt.equals(nome)) {
				count++;
			}
			else {
				nomePessoaQuant.put(nome, count);
				nomeAnt = nome;
				count = 1;
			}
			System.out.println(nome + " - " + count);
		}
		
		return nomePessoaQuant;
	}
}
