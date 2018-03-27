package br.prova.santiagoecintra;


public class Questao2 {

	public static void main(String[] args) {
		
		// sequencia 0, 1, 3, 6, 10, 15, 21
		//lógica - valor anterior mais valor numérico da n-ésima parte do número atual 
		// 0, 0+1=1, 1+2=3, 3+3=6, 6+4=10, 10+5=15, ...
		
		valorNesimaPosicao(7);
	}
	
	private static int valorNesimaPosicao(int posicaoN) {

		int valor = 0;
		
		for (int i=1 ; i < posicaoN ; i++)
		{
			if(posicaoN == 1)
			{
				//System.out.println(valor);
				return valor;
			}
			else
			{
				valor += i;
			}
			
		}
		System.out.println(valor);
		return valor;
	}

}
