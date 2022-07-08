
import javax.swing.JOptionPane;

public class Ejercicio11App {
	public static void main(String[] args) {
		
		/*
		 * Crea una aplicación que nos pida un día
		 * de la semana y que nos diga si es un día
		 * laboral o no. Usa un switch para ello.
		 */
		
		// Declaramos la variable y le asignamos el valor del JOptionPane
		String dia = JOptionPane.showInputDialog("Introduce un día de la semana");
		
		// Declaramos la variable mensaje
		String mensaje;
		
		// Switch por cada día de la semana
		switch (dia.toUpperCase()) {
			case "LUNES":
				mensaje = "laboral";
				break;
			case "MARTES":
				mensaje = "laboral";
				break;
			case "MIERCOLES":
				mensaje = "laboral";
				break;
			case "JUEVES":
				mensaje = "laboral";
				break;
			case "VIERNES":
				mensaje = "laboral";
				break;
			case "SABADO":
				mensaje = "no laboral";
				break;
			case "DOMINGO":
				mensaje = "no laboral";
				break;
			default:
				mensaje = "No has introducido un dia correcto";
		}
		
		// Imprimimos la conclusión (Laborable, No Laborable o Error)
		JOptionPane.showMessageDialog(null, "El día de la semana que has introducido -> " + dia + " <- es: " + mensaje);
		
	}
}
