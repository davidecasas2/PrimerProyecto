import java.util.Scanner;

/** 
 * 3. Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla 
el doble y el triple de ese número.
 * @author David
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		// definimos una variable de tipo float
		float num;
		
		// definimos el Scanner para leer desde teclado
		Scanner entrada = new Scanner(System.in);

		// mostramos el mensaje por pantalla
		System.out.println("Introduce un número: ");
		// pedimos el número por teclado
		num = entrada.nextFloat();
		 /*
		float doble = num*2;
		float triple = num*3;
		
		System.out.println("el doble es: "+ doble+ " y el triple "+triple);*/
		System.out.println("el doble es: "+ num*2 + " y el triple "+num*3);
		
		System.out.println("el número mas 2 es: "+ (num+2) + " y más 3 es "+(num+3));
		
		
		
		
	}

}
