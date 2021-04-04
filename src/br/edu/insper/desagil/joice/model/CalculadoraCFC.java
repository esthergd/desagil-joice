package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {
	
	public CalculadoraCFC() {
		super("CFC"); 
	}
	
	public double calcula(double peso, double raio) {
		double raioCm = raio/10000000;
		double Na = 6.023 * Math.pow(10, 23);
		double vc = Math.pow((4 * raioCm)/(Math.pow(2, 0.5)), 3);
		double ro = (4* peso)/(vc*Na);
		return ro;
	}
}