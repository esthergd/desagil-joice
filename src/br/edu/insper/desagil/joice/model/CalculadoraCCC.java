package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {
	
	public CalculadoraCCC() {
		super("CCC"); 
	}
	
	public double calcula(double peso, double raio) {
		double raioCm = raio/10000000;
		double Na = 6.023 * Math.pow(10, 23);
		double vc = Math.pow((4 * raioCm)/(Math.pow(3, 0.5)), 3);
		double ro = (2* peso)/(vc*Na);
		return ro;
	}
}
