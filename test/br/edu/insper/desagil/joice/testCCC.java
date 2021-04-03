package br.edu.insper.desagil.joice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import br.edu.insper.desagil.joice.model.CalculadoraCCC;

public class testCCC {
	private CalculadoraCCC calculo;
	
	@BeforeEach
	public void setUp() {
		calculo = new CalculadoraCCC();
	}
	@Test
	public void testTungstenio() {
		assertEquals(19.28, calculo.calcula(183.84, 0.137), 0.05);
	}
	@Test
	public void testNiobio() {
		assertEquals(8.57, calculo.calcula(92.91, 0.143), 0.05);
	}
	@Test
	public void testLitio() {
		assertEquals(0.53, calculo.calcula(6.94, 0.152), 0.05);
	}
	
}