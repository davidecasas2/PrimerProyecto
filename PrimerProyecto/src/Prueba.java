import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Tu nombre es "+ nombre);
		entrada.close();

	}

}
