package poo;

public class NaveNoTripulada extends Nave{
	
	private int motores_extra;
	
	private int empuje_principal;
	
	private int kilometros_por_hora;


public NaveNoTripulada(int motores_extra, int empuje_principal, int kilometros_por_hora) {

	super();
		
	this.motores_extra = motores_extra;
	
	this.empuje_principal = empuje_principal;
	
	this.kilometros_por_hora = kilometros_por_hora;
	
 }

public String dime_datos_NaveNoTripulada() {
	
	return " La nave tiene " + motores_extra + " motores extra. " + " El empuje principal de la nave es de " + empuje_principal + " kg. " + " Y puede recorrer" + kilometros_por_hora + " km/h.";
	
}
}