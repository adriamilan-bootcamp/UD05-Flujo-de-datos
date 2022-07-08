
import javax.swing.JOptionPane;

public class Ejercicio13App {

	public static void main(String[] args) {
		
		/*
		 * Crea una aplicación llamada CalculadoraInversa, nos 
		 * pedirá 2 operadores (int) y un signo aritmético (String), 
		 * según este último se realizara la operación correspondiente.
		 * Al final mostrara el resultado en un cuadro de dialogo.
		 */
		
		/*
		 * Los signos aritméticos disponibles son:
		 * - +: suma los dos operandos.
		 * - -: resta los operandos.
		 * - *: multiplica los operandos.
		 * - /: divide los operandos, este debe dar un resultado
		 *      con decimales (double).
		 * - ^: 1º operando como base y 2º como exponente.
		 * - %: módulo, resto de la división entre operando1 y operando2.
		 */
		
		int operador1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer valor: "));
		int operador2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo valor: "));
		
		String operacion = JOptionPane.showInputDialog("Introduce la operación aritmética que quieres emplear (sumar, restar, multiplicar, dividir, base o módulo)");   
		
		int resultado = 0;
		Boolean error = false;
		switch (operacion.toUpperCase()) {
			case "SUMAR":
				resultado = operador1 + operador2;
				break;
			case "RESTAR":
				resultado = operador1 - operador2;
				break;
			case "MULTIPLICAR":
				resultado = operador1 * operador2;
				break;
			case "DIVIDIR":
				resultado = operador1 / operador2;
				break;
			case "BASE":
				resultado = operador1 ^ operador2;
				break;
			case "MODULO":
				resultado = operador1 % operador2;
				break;
			default:
				JOptionPane.showMessageDialog(null, "El operador aritmético que has introducido es incorrecto");
				error = true;
				break;
		}
		
		if (!error) {
			JOptionPane.showMessageDialog(null, "El resultado de tu operación es: " + resultado);
		}
		
	}
	
}
