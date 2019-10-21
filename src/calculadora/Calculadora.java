package calculadora;

public class Calculadora {

	public Integer soma(Integer numero1, Integer numero2) {
		if (numero1 == null || numero2 == null) {
			throw new NumberFormatException("Ajusta ai mané");
		}
		return numero1 + numero2;
	}

	public void subtrair(Integer num1, Integer num2) {
		throw new NumberFormatException();
	}

}
