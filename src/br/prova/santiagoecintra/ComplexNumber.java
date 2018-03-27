package br.prova.santiagoecintra;

public class ComplexNumber {
	
	private double a;
	private double b;
	
	public ComplexNumber()
	{
		this.a = 0;
		this.b = 0;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public ComplexNumber(double _a, double _b)
	{
		this.a = _a;
		this.b = _b;
	}
	
	public void soma (ComplexNumber _complexNumber)
	{
		this.a += _complexNumber.a;
		this.b += _complexNumber.b;
	}
	
	public static ComplexNumber somaComplexNumber(ComplexNumber _complexNumber01, ComplexNumber _complexNumber02)
	{
		ComplexNumber _complexNumber = new ComplexNumber(_complexNumber01.a, _complexNumber01.b);
		
		_complexNumber.soma(_complexNumber02);
		
		return _complexNumber;
	}
	
	@Override
	public String toString() {
		return "ComplexNumber [a=" + a + ", b=" + b + "] -> z = " + a + " + " + b + "i";
	}
}
