
import javax.swing.JOptionPane;

public class Ejercicio03App {
	public static void main(String[] args) {
		
		/*
		 * Modifica la aplicación anterior,
		 * para que nos pida el nombre que
		 * queremos introducir (recuerda
		 * usar JOptionPane)
		 */
		
		// Declaramos la variable nombre y le asignamos el valor de un JOptionPane
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		// Mensaje de Bienvenida con JOptionPane
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
		
	}
}
