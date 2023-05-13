package poo;

public class NaveTripulada extends Nave {
	
	private int numero_tripulantes;
	
	private int orbita;
	

public NaveTripulada(int numero_tripulantes, int orbita) {

	super();
		
	this.numero_tripulantes = numero_tripulantes;
	
	this.orbita = orbita;
	
 }

public String dime_datos_NaveTripulada() {
	
	return " El numero de tripulantes es: " + numero_tripulantes + " . Y la nave orbita a: " + orbita + " km de distancia.";
	
}
}
