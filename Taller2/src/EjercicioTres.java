import java.util.Scanner;

public class EjercicioTres {

Scanner sc = new Scanner (System.in);
	
public void colegio () { 
	
	int estudiantes = 0;
	int buses = 0;
	int furgonetas = 0;
	
	System.out.println("¿Cuantas personas iran de viaje?");
	
	estudiantes = sc.nextInt();
	
	System.out.println("¿Cuantos autobuses se necesitan?");
	
	if (estudiantes <= 45) {
		
		buses = 1;
		
		buses = sc.nextInt(1);
		
	}
	
	else {
		
		System.out.println("¿Cuantas furgonetas se necesitan?");
	
		buses += furgonetas;
		
		furgonetas = sc.nextInt();
		
	}
	
	System.out.println(buses + furgonetas);
 }
}
