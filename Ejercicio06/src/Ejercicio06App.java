
import javax.swing.JOptionPane;

public class Ejercicio06App {
	public static void main(String[] args) {
		
		/*
		 * Lee un número por teclado que pida el precio
		 * de un producto (puede tener decimales) y
		 * calcule el precio final con IVA. El IVA
		 * sera una constante que sera del 21%
		 */
		
		// Constante IVA
		final double IVA = 1.21;
		
		// Declaramos la variable y le asignamos el valor del JOptionPane
		Double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de tu producto"));
		
		// Calculamos e Imprimimos el precio final con IVA
		JOptionPane.showMessageDialog(null, "El precio final con IVA del producto es: " + (precio * IVA));
		
	}
}
