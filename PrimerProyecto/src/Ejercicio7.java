import java.util.Scanner;

/**
 * 7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud 
de la hipotenusa según el teorema de Pitágoras. 
 * @author David
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un cateto");
		double cateto1 = teclado.nextDouble();
		
		System.out.println("Introduce el otro cateto");
		double cateto2 = teclado.nextDouble();
		
		double aux =cateto1*cateto1+Math.pow(cateto2,2);
		double hipotenusa = Math.sqrt(aux);
		
		System.out.printf("LA hipotenusa del triángulo es %.2f", hipotenusa);
		
		
	}

}
