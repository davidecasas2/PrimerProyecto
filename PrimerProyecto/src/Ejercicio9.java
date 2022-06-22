import java.util.Scanner;

/**
 * 9. Programa que calcula el área de un triángulo a partir de la longitud 
 * de sus lados. Mediante la fórmula de Herón raiz(s*(s-a)*(s-b)*(s-c))
 * donde s=(a+b+c)/2
 * @author David
 *
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Lado 1:");
		double a = entrada.nextDouble();
		
		System.out.println("Lado 2:");
		double b = entrada.nextDouble();
		
		System.out.println("Lado 3:");
		double c = entrada.nextDouble();
		
		double s =(a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.printf("El área del triángulo de lados %.2f, "
				        + "%.2f y %.2f es %.2f", a, b, c,area);
		
		


	}

}
