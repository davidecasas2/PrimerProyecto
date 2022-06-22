import java.util.Scanner;

/**
 * 12. Programa que lea un número entero N de 5 cifras y
 *  muestre sus cifras desde el principio como en el ejemplo.
 *  Por ejemplo, para un número N = 12345, 
 *  la salida debe ser:
	5
	45
	345
	2345
	12345

 * @author David
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce un numero: ");
		int num = entrada.nextInt();
		System.out.printf("El número es %d\n",num);
		
		
		
		System.out.printf("%5d\n",num%10);
		System.out.printf("%5d\n",num%100);
		System.out.printf("%5d\n",num%1000);
		System.out.printf("%5d\n",num%10000);
		System.out.printf("%5d\n",num);
		
		

	}

}
