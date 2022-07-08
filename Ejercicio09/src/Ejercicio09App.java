
public class Ejercicio09App {
	public static void main(String[] args) {
		
		/*
		 * Muestra los números del 1 al 100 (ambos incluidos)
		 * divisibles entre 2 y 3. Utiliza el bucle que 
		 * desees.
		 */
		
		// Bucle for
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.println("-> " + i);
			} else {
				System.out.println("x> " + i);
			}
		}
		
	}
}
