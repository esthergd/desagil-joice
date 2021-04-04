package br.edu.insper.desagil.joice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.insper.desagil.joice.model.CalculadoraCFC;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCFC {
	private CalculadoraCFC calculo;
	
	@BeforeEach
	public void setUp() {
		calculo = new CalculadoraCFC();
	}
	@Test
	public void testCobre() {
		assertEquals(8.89, calculo.calcula(63.55, 0.128), 0.05);
	}
	@Test
	public void testOuro() {
		assertEquals(19.36, calculo.calcula(196.97, 0.144), 0.05);
	}
	@Test
	public void testPrata() {
		assertEquals(10.60, calculo.calcula(107.87, 0.144), 0.05);
	}

}