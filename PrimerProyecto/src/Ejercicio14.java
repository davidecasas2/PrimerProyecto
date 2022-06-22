import java.util.Scanner;

/**
 * 14. Programa que calcula el número de la suerte de una persona a partir de su fecha de 
nacimiento.
El número de la suerte se calcula sumando el día, mes y año de la fecha de 
nacimiento y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980
Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 28
Número de la suerte: 28
 * @author David
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("C�lculo del n�mero de la suerte");
		System.out.println("D�a Nacimiento: ");
		int d�a=teclado.nextInt();
		System.out.println("Mes Nacimiento: ");
		int mes=teclado.nextInt();
		System.out.println("A�o Nacimiento: ");
		int a�o=teclado.nextInt();
		
		int suma = d�a+mes+a�o;
		
		int numSuerte= suma/1000;
		int resto = suma %1000;
		numSuerte = numSuerte + resto/100;
		resto = resto %100;
		numSuerte = numSuerte + resto/10;
		numSuerte = numSuerte + resto%10;
		
		System.out.println("Tu n�mero de la suerte es: "
		                   +numSuerte);
	}

}
