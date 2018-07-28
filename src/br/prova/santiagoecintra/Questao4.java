package br.prova.santiagoecintra;

import java.util.ArrayList;

import java.util.List;

public class Questao4 {

	public static void main(String[] args) {
		
		// Soma do quadrado do numeros primos de uma lista
		
		List<Integer> list = new ArrayList<Integer>();
			
		//Exemplo de entrada: {  } 
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		
		int somaQuadradoPrimos = somaQuadradoPrimos(list);
		
		System.out.println(somaQuadradoPrimos);

	}

	private static int somaQuadradoPrimos(List<Integer> list) {
	
		int somaValores = 0;
		
		for (Integer valor : list)
		{
			boolean isPrimo = true;
			
			for(int i=2; i < valor ; i++)
			{
				if(valor%i == 0 && valor != 2)
				{
					isPrimo = false;
				}
			}
			if(isPrimo)
				somaValores += valor;
			
		}
		return somaValores;
	}

}
