package poo;

public class NaveLanzadera extends Nave {
	
	private int capacidad_carga;
	
	private int potencia_sistema_propulsion ;


public NaveLanzadera(int capacidad_carga, int potencia_sistema_propulsion) {

	super();
		
	this.capacidad_carga = capacidad_carga;
	
	this.potencia_sistema_propulsion = potencia_sistema_propulsion;
	
 }

public String dime_datos_NaveLanzadera() {
	
	return " La capacida de carga es: " + capacidad_carga + " . Y el sistema de propulsion tiene " + potencia_sistema_propulsion + " caballos de potencia.";
	
}
}
