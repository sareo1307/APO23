import java.util.Scanner;

public class Principal {
	
	static Scanner sn = new Scanner(System.in);
	
public static void main(String[] args) {
	
	boolean salir = false;
    int opcion =0;

    EjercicioUno eu = new EjercicioUno();    
    EjercicioDos ed = new EjercicioDos();   
    EjercicioTres et = new EjercicioTres ();
 
	
    while (!salir) {
    	 
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Salir");
    
    		opcion = sn.nextInt();
    		
    		switch (opcion) {
    	    case 1:
    	    	
    	        System.out.println("Has seleccionado la opcion 1" );
    	        eu.calculararea();
    	        break;
    	    case 2:
    	        System.out.println("Has seleccionado la opcion 2");
    	        ed.calcularraiz();
    	        
    	        ed.calcularoperacionB();
    	        
    	        ed.calcularcoseno();
    	        
    	        ed.calcularraiz2();
    	        
    	        ed.division();
    	        
    	        ed.coseno2();
    	        break;
    	    case 3:
    	        System.out.println("Has seleccionado la opcion 3" );
    	        et.colegio();
    	        break;
    	    case 4:
    	        System.out.println("Has seleccionado la opcion 4");
    	        break;
    	    default:
    	        System.out.println("Solo números entre 1 y 3");
    	       } 
    }
  }
}

