import java.util.Scanner;

public class Cond_IF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		System.out.println("Digite seu salario para calcularmos os impostos: R$ = ");
		
		salario = sc.nextDouble();
		
		if ( salario <= 2000.00) {
			
			System.out.println("Isento");
		}                                                   
		else if (salario <= 3000.00) {
			imposto = (salario - 2000) * 0.08 ;
			System.out.printf("R$: %.2f%n" , imposto);
		}
		else if (salario <= 4500) {
			imposto = (salario - 3000.0) * 0.18 + 1000 * 0.08  ;
			System.out.printf("R$: %.2f%n" , imposto);
		}
		else {
			imposto = ( salario - 4500.00)* 0.28 + 1500 * 0.18 + 1000* 0.08;
			System.out.printf("R$: %.2f%n" , imposto);
			
		}
		
		
		
sc.close();
	}

}
