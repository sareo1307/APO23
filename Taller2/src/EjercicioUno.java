import java.util.Scanner;

public class EjercicioUno {

Scanner sc = new Scanner (System.in);

double base = 0.0;
double altura = 0.0;
double area = 0.0;

public void calculararea() {
	
	System.out.println("Ingrese el valor de la base");
	
	base = sc.nextDouble();
	
	System.out.println("Ingrese el valor de la altura");
	
	altura = sc.nextDouble();
	
	area = (base*altura)*1/2;
	
	System.out.println("El valor del area es igual a: " + area);
	
 }
}
