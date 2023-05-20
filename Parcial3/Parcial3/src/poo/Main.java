package poo;

import java.util.Scanner;

public class Main {
	
	public static Nave[] inventarioNaves;
	
public static void main(String[] args) {
		
	inventarioNaves = new Nave[9];
	
	Scanner sn = new Scanner(System.in);
	
		boolean terminar_programa = false;

	    while (!terminar_programa) {
	    	
	    	System.out.println("Seleccione una opcion");
	        System.out.println("1. Crear nave");
	        System.out.println("2. Buscar nave");
	        System.out.println("3. Terminar programa");
	    
	    	int opcion = sn.nextInt();
	    		
	    	switch (opcion) {
	    	case 1:
	   
	    	CrearNave();
	    	
	    	break;
	    	
	    	case 2:
	    	
	    	BuscarNave();	
	    		
	    	break;
	    	
	    	case 3:
	    	
	    	terminar_programa = true;	
	    		
	    	break;
	    	
	    	default:
	    	System.out.println("Solo números entre 1 y 3");
  } 
 }
}

private static void CrearNave() {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingrese el tipo de nave(1, 2 o 3)");
	
	int tipoNave = scanner.nextInt();
	
	if (tipoNave < 1 || tipoNave > 3) {
		
	System.out.println("Solo números entre 1 y 3");
		
	return;
	}
	
	System.out.println("Ingrese la cantidad de naves que quiere crear");
	
	int cantidadNave = scanner.nextInt();
	
	for (int i = 0; i < cantidadNave; i ++) {
		
		Nave nuevaNave = null;
		
	switch (tipoNave) {
	
	case 1:	
	
		System.out.println("Ingrese la capacidad de carga");
		int capacidad_carga = scanner.nextInt();
		
		System.out.println("Ingrese la potencia sistema propulsion");
		int potencia_sistema_propulsion = scanner.nextInt();
		
		nuevaNave = new NaveLanzadera(capacidad_carga,potencia_sistema_propulsion);
		
		break;
		
	case 2:
		
		System.out.println("Ingrese los motores extra");
		int motores_extra = scanner.nextInt();
		
		System.out.println("Ingrese el empuje principal");
		int empuje_principal = scanner.nextInt();
		
		System.out.println("Ingrese los kilometros por hora");
		int kilometros_por_hora = scanner.nextInt();
		
		nuevaNave = new NaveNoTripulada(motores_extra,empuje_principal,kilometros_por_hora);
		
		break;
		
	case 3:
		
		System.out.println("Ingrese el numero de triuplantes");
		int numero_tripulantes = scanner.nextInt();
		
		System.out.println("Ingrese la orbita");
		int orbita = scanner.nextInt();
		
		nuevaNave = new NaveTripulada(numero_tripulantes,orbita);
		
		break;
	
	}
		
		for (int j = 0; j < inventarioNaves.length ; j ++ ) {
			
		if (inventarioNaves[j] == null) {
			
		inventarioNaves[j] = nuevaNave;
			
		System.out.println("Nave creada y agregada al inventario");
		
		break;
  }
 }	
}
}	
	
	
private static void BuscarNave() {
	
	Scanner scanner = new Scanner(System.in); 
		
	System.out.println("Ingrese el tipo de nave que quiere buscar (1, 2 o 3)");
	
	
	
	
	

}
}