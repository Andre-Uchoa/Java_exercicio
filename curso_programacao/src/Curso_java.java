import java.util.Scanner;

public class Curso_java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int minutos;
		minutos = sc.nextInt();

		double valor = 50.0 ;
		
		if( minutos > 100) {
			valor = valor + (minutos - 100) * 2.0;
		}
		
		System.out.printf("O valor da conta foi: R$ = %.2f%n ", valor);
		
		
		
		
		
		
		
		sc.close();

	}
}
