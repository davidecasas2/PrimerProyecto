import java.util.Scanner;

/**
 * 11. Programa que lee un número de 3 cifras y muestra sus
 *  cifras por separado.
345 
3
4
5 
 * @author David
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un número de 3 cifras:");
		int num = entrada.nextInt();
		
		System.out.println(" el numero es: "+num);
		int cifra1 = num/100;
		int resto = num%100;
		int cifra2 = resto/10;
		int cifra3 = resto%10;
		
		System.out.println(cifra1);
		System.out.println(cifra2);
		System.out.println(cifra3);
	}
}
