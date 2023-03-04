import java.util.Scanner;

public class EjercicioDos {
	
Scanner sc= new Scanner (System.in);
	
double a = 0.0;
double b = 0.0;
double c = 0.0;
double d = 0.0;
double e = 0.0;
double f = 0.0;
double x = 0.0;
double y = 0.0;
double z = 0.0;
	
public void calcularraiz() {
	
	System.out.println("Ingrese el valor de la x");
	
	x = sc.nextDouble();
	
	a = Math.pow(x, 5);
	
	a = (Math.sqrt(Math.pow(x, 5))-6)/4;
	
	System.out.println("Muestre la ecuacion" + a);
 }

public void calcularoperacionB() {
	
	System.out.println("Ingrese el valor de la X");
	
	x = sc.nextDouble();
	
	System.out.println("Ingrese el valor de Y");
	
	y = sc.nextDouble();
	
	b = Math.pow(x, y);
	
	b= (Math.pow(x, y) - Math.pow(6, x));
	
	System.out.println("Muestre la ecuacion" + b);	
 }

public void calcularcoseno() {
	
	System.out.println("Ingrese el valor de la Z");
	
	z = sc.nextDouble();
	
	System.out.println("Ingrese el valor de la X");
	
	x = sc.nextDouble();
	
	c = 4*Math.cos(z/5) - Math.sin(Math.pow(x, 2));
	
	System.out.println("Muestre la ecuacion" + c);

 }
	
public void calcularraiz2() {
	
	System.out.println("Ingrese el valor de la X");
	
	x = sc.nextDouble();
	
	System.out.println("Ingrese el valor de la Y");
	
	y = sc.nextDouble();
	
	d = Math.pow(x, 4);
	
	d = Math.pow(x, 4) - Math.sqrt(6*x - Math.pow(y, 3));
	
	System.out.println("Muestre la ecuacion" + d);
	
 }

public void division() {
	
	System.out.println("Ingrese el valor de la X");
	
	x = sc.nextDouble();
	
	System.out.println("Ingrese el valor de la Y");
	
	y = sc.nextDouble();
	
	e = 1/y*1/x - Math.pow(2, y);
	
	System.out.println("Muestre la ecuacion" + e);
	
 }

public void coseno2() {
	
	System.out.println("Ingrese el valor de la X");
	
	x = sc.nextDouble();
	
	System.out.println("Ingrese el valor de la Y");
	
	y = sc.nextDouble();
	
	f = 7*(Math.cos(Math.sqrt(5-Math.sin(Math.sqrt(3*x - 4)))));
	
	System.out.println("Muestre la ecuacion" + f);
	
 }
}
