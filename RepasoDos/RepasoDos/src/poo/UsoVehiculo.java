package poo;

public class UsoVehiculo {

public static void main(String[] args) {
		
	Coche micoche1 = new Coche();
	
	micoche1.establecer_color("Rojo");
	
	Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
	
	mifurgoneta1.establecer_color("Azul");
	
	mifurgoneta1.configurar_asientos("Si");
	
	mifurgoneta1.configura_climatizador("Si");
	
	System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
	
	System.out.println(mifurgoneta1.dime_datos_generales() + " " + mifurgoneta1.dimeDatosFurgoneta());

 }
}