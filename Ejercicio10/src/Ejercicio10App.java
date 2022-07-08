
import javax.swing.JOptionPane;

public class Ejercicio10App {
	public static void main(String[] args) {
		
		/* 
		 * Realiza una aplicación que nos pida un número
		 * de ventas a introducir, después nos pedira tantas
		 * ventas por teclado como número de ventas se hayan
		 * indicado. Al final mostrara la suma de todas las
		 * ventas. Piensa que es lo que se repite y lo que no.
		 */
		
		// Número de ventas
		int ventas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de ventas"));
		
		// Valor Final (Suma de todas las ventas)
		double valorFinal = 0;
		
		// Pedir x ventas con un bucle
		for (int i = 1; i <= ventas; i++) {
			double valorProducto = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la venta número " + i + "/" + ventas));
			valorFinal += valorProducto;
		}
		
		// Mostramos la suma total de las ventas
		JOptionPane.showMessageDialog(null, "El valor total de las ventas es: " + valorFinal + "€");
		
	}
}
