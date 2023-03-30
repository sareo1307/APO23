
public class Punto4 {
public static void main(String[] args) {
	  	
// error de sintaxis
	int x = 5;
	
	if (x == 5) {
		
	 System.out.println("El valor de x es 5.");
	 
	} else {
		
	 System.out.println("El valor de x no es 5.");
	        
// error lógico
	int a = 10;
	
	int b = 5;
	
	if (a > b) {
		
	 System.out.println("a es mayor que b.");
	 
	} else {
		
	  System.out.println("a es menor que b.");
	  
	}
	        
// excepción
	int[] numeros = new int[5];
	
	try {
		
	  numeros[5] = 10;
	  
	} catch (ArrayIndexOutOfBoundsException e) {
		
	  System.out.println("Se produjo una excepción: " + e.getMessage());
	  
	}
  }
 }
}

