package br.prova.santiagoecintra;

public class Questao1 {

	public static void main(String[] args) {

		
		ComplexNumber _complexNumber01 = new ComplexNumber(14, 6);
		
		ComplexNumber _complexNumber02 = new ComplexNumber(7, 3);
		
		
		ComplexNumber _complexNumber03 = ComplexNumber.somaComplexNumber(_complexNumber01, _complexNumber02);
		
		System.out.println(_complexNumber01.toString());
		
		System.out.println(_complexNumber02.toString());
		
		System.out.println(_complexNumber03.toString());
	}

}
