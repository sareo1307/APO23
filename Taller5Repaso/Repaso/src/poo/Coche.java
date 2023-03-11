package poo;

public class Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero;
	
	public Coche() {
		
		ruedas = 4;
		
		largo = 5000;
		
		ancho = 2000;
		
		motor = 2400;
		
		peso_plataforma = 700;
		
		peso_total = 3100;
		
	}
	public String dime_datos_generales() {
		
		return "La plataforma del vehiculo tiene " + ruedas + "ruedas " + ". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm y un motor de " + motor + "cc y un peso de plataforma de " + peso_plataforma + " kg";		
 }
	
	public void establecer_color(String color_coche) {
		
		color = color_coche;
		
 }
	
	public String dime_color() {
		
		return "El color del coche es " + color;
		
 }
	public void configurar_asientos(String asientos_cuero) {
		
		if(asientos_cuero == "si") {
			
			this.asientos_cuero = true;
		}
		
		else {
			
			this.asientos_cuero = false;
		}	
 }
	
	public String dime_asientos() {
		
		if(asientos_cuero == true) {
			
			return "El coche tiene asientos de cuero";
		}
		
		else {
		
			return "El coche tiene asientos de serie";
			
		}
	}
	
	public String dime_peso_total() {
		
		return "El peso total del coche es " + peso_total + " kg";
			
 }
}