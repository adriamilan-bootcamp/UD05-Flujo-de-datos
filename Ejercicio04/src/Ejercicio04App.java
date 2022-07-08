
import javax.swing.JOptionPane;

public class Ejercicio04App {
	public static void main(String[] args) {
		
		/* 
		 * Haz una aplicación que calcule el área
		 * de circulo (pi*R^2). El radio se pedirá
		 * port teclado (Recuerda pasar de String a
		 * double con Double.parseDouble). Usa la
		 * constante PI y el método pow de Math.
		 */
		
		// Declaramos la constante pi
		final double PI = 3.1415;
		
		// Declaramos la variable radio y le asignamos el valor del JOptionPane
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de tu ciruclo"));
		
		// Calculamos el área y lo imprimimos con JOptionPane
		JOptionPane.showMessageDialog(null, "El área del circulo es: " + (PI * (radio * radio)));
		
	}
}
