import java.util.Scanner;

public class Aula_5_exercicio_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,tri,cir,tra,qua,ret;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		tri = (A * C) / 2;
		cir = (C * C * 3.14159);
		tra = ((A + B ) * C ) /2;
		qua = (B * B);
		ret = (A * B);
		
		System.out.printf("Triangulo: %.3f%n", tri);
		System.out.printf("Circulo: %.3f%n", cir);
		System.out.printf("Trapezio: %.3f%n", tra);
		System.out.printf("Quadrado: %.3f%n", qua);
		System.out.printf("Retangulo: %.3f%n", ret);

				
		
sc.close();
	}

}
