package calculadora;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		String retornoDoUsuario = JOptionPane.showInputDialog("Digite um número");
		Integer numero1 = retornoDoUsuario.isEmpty() ? null : Integer.parseInt(retornoDoUsuario);
		Integer numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(numero1, numero2));
	}
	
}
