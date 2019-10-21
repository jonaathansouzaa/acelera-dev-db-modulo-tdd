package calculadora;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void somaDeDoisNumerosPositivos() {
		Integer numero1 = 7;
		Integer numero2 = 10;
		Integer esperado = 17;
		Calculadora calculadora = new Calculadora();
		Integer resultadoSoma = calculadora.soma(numero1, numero2);
		Assert.assertEquals(esperado, resultadoSoma);
	}
	
	@Test
	public void somaDePeloMenosUmNumeroNegativo() {
		Integer numero1 = -20;
		Integer numero2 = 10;
		Integer esperado = -10;
		Calculadora calculadora = new Calculadora();
		Integer resultadoSoma = calculadora.soma(numero1, numero2);
		Assert.assertEquals(esperado, resultadoSoma);
	}
	
	@Test(expected = NumberFormatException.class)
	public void somaComPrimeiroNumeroNulo() {
		Integer numero1 = null;
		Integer numero2 = 10;
		Calculadora calculadora = new Calculadora();
		calculadora.soma(numero1, numero2);
	}
	
	@Test(expected = NumberFormatException.class)
	public void somaComSegundoNumeroNulo() {
		Integer numero1 = 10;
		Integer numero2 = null;
		Calculadora calculadora = new Calculadora();
		calculadora.soma(numero1, numero2);
	}
	
	@Test(expected = NumberFormatException.class)
	public void somaComOsDoisNumerosNulo() {
		Integer numero1 = null;
		Integer numero2 = null;
		Calculadora calculadora = new Calculadora();
		calculadora.soma(numero1, numero2);
	}
	
	@Test(expected = NumberFormatException.class)
	public void subtraiComDoisValoresPrimeiroNull() {
		Integer num1 = null;
		Integer num2 = 10;
		
		Calculadora  calculadora =  new Calculadora();
		calculadora.subtrair(num1, num2);
		
	}
	
	
}
