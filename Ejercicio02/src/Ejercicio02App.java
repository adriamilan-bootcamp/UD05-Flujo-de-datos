
import java.util.Scanner;

public class Ejercicio02App {
	public static void main(String[] args) {
		
		/* 
		 * Declara un String que contenga tu nombre,
		 * depués muestra un mensaje de bienvenida
		 * por consola. Por ejemplo: si introduzco
		 * "Fernando", me aparezca "Bienvenido Fernando".
		 */
		
		// Iniciamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Mensaje por pantalla
		System.out.println("Introduce tu nombre: ");
		
		/* 
		 * Declarando la variable nombre
		 * y asignandole el valor del scanner
		 */
		String nombre = sc.nextLine();
		
		// Cerramos el scanner
		sc.close();
		
		// Mensaje de Bienvenida
		System.out.println("Bienvenido: " + nombre);
		
	}
}
