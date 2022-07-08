
import javax.swing.JOptionPane;

public class Ejercicio12App {
	public static void main(String[] args) {
		
		/*
		 * Escribe una aplicación con un String que
		 * contenga una contraseña cualquiera. Después
		 * se te pedirá que introduzcas la contraseña, con 3 intentos.
		 * Cuando aciertes ya no pedirá mas la contraseña y mostrara un
		 * mensaje diciendo "Enhorabuena". Piensa bien en la condición de
		 * salida (3 intentos y si acierta sale, aunque le queden intentos).
		 */
		
		// Declarando la constante contraseña
		final String PASS = "secret";
		
		for (int i = 1; i <= 3; i++) {

			String intento = JOptionPane.showInputDialog("Introduce la contraseña " + i + "/3");
			
			if (intento.equals(PASS)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena, has introducido la contraseña correcta!");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta!");
			}
		}

	}
}
