import java.util.Scanner;

/**
 * 8. Programa que calcula el volumen de una esfera.
 * @author David
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el radio de la esfera: ");
		double radio = entrada.nextDouble();
		
		//double volumen = 4/3*Math.PI*Math.pow(radio, 3);
		//System.out.printf("El volumen mal es : %.2f", volumen);
		
		double volumen = 4*Math.PI*Math.pow(radio, 3)/3;
		System.out.printf("El volumen bien es : %.2f", volumen);

	}

}
