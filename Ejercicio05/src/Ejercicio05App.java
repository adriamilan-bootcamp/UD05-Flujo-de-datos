
import javax.swing.JOptionPane;

public class Ejercicio05App {
	public static void main(String[] args) {
		
		/*
		 * Lee un número por teclado e indica si
		 * es divisible entre 2 (resto = 0). Si
		 * no lo es, también debemos indicarlo.
		 */
		
		// Declaramos la variable y le asignamos el valor del JOptionPane
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		
		// Calculamos e Imprimimos con JOptionPane la conclusión
		String conclusion;
		if (numero % 2 == 0) {
			conclusion = "divisible entre 2";
		} else {
			conclusion = "no divisible entre 2";
		}
		
		JOptionPane.showMessageDialog(null, "El número que has introducido es: " + conclusion);
		
	}
}
