package br.edu.insper.desagil.joice;

public class testCFC {
	private CalalculadoraCFC calculo;
	
	@BeforeEach
	public void setUp() {
		calculo = new CalculadoraCFC();
	}
	@Test
	public void testCobre() {
		assertEquals(8.89, calculo.calcula(63.95, 0.128), 0.05);
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