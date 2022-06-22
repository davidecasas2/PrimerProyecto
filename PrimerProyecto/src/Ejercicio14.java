import java.util.Scanner;

/**
 * 14. Programa que calcula el nÃºmero de la suerte de una persona a partir de su fecha de 
nacimiento.
El nÃºmero de la suerte se calcula sumando el dÃ­a, mes y aÃ±o de la fecha de 
nacimiento y a continuaciÃ³n sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980
Calculamos el nÃºmero de la suerte asÃ­: 12+7+1980 = 1999 1+9+9+9 = 28
NÃºmero de la suerte: 28
 * @author David
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cálculo del número de la suerte");
		System.out.println("Día Nacimiento: ");
		int día=teclado.nextInt();
		System.out.println("Mes Nacimiento: ");
		int mes=teclado.nextInt();
		System.out.println("Año Nacimiento: ");
		int año=teclado.nextInt();
		
		int suma = día+mes+año;
		
		int numSuerte= suma/1000;
		int resto = suma %1000;
		numSuerte = numSuerte + resto/100;
		resto = resto %100;
		numSuerte = numSuerte + resto/10;
		numSuerte = numSuerte + resto%10;
		
		System.out.println("Tu número de la suerte es: "
		                   +numSuerte);
	}

}
