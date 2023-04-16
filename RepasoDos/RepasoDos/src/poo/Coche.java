package poo;

public class Coche{
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
public Coche(){
		
	ruedas = 4;
		
	largo = 5000;
		
	ancho = 2000;
		
	motor = 2400;
		
	peso_plataforma = 700;
		
	peso_total = 3100;
		
}

public String dime_datos_generales(){
		
	return "La plataforma del vehiculo tiene " + ruedas + "ruedas " + ". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm y un motor de " + motor + "cc y un peso de plataforma de " + peso_plataforma + " kg";
	
}
	
public void establecer_color(String color_coche){
		
	color = color_coche;
		
}
	
public String dime_color(){
		
	return "El color del coche es " + color;
		
}

public void configurar_asientos(String asientos_cuero){
		
	if(asientos_cuero == "si"){
			
	this.asientos_cuero = true;
	
}else{
			
	this.asientos_cuero = false;
	
 }	
}
	
public String dime_asientos(){
		
	if(asientos_cuero == true){
			
	return "El coche tiene asientos de cuero";
	
}else{
		
	return "El coche tiene asientos de serie";
			
 }
}

public void configura_climatizador (String climatizador){
	
	if (climatizador.equalsIgnoreCase("si")){
	
	this.climatizador = true;	
		
}else{
	
	this.climatizador = false;
	
 }
}

public String dime_climatizador(){
	
	if (climatizador == true){
	
	return "El coche incorpora climatizador";
	
}else{
	
	return "El coche lleva aire acondicionado";

 }
}

public String dime_peso_total(){
	
	int peso_carroceria = 500;
	
	peso_total = peso_plataforma + peso_carroceria;
	
	if (asientos_cuero == true){
	
	peso_total = peso_total + 50;
	
}	
	
	if (climatizador == true){
	
	peso_total = peso_total + 20;
		
}		
	
	return "El peso total del coche es " + peso_total + " kg";
	
}
	
public int precio_coche(){
	
	int precio_final = 1000;
	
	if (asientos_cuero == true){
	
	precio_final += 2000;
	
}
	
	if (climatizador == true) {
	
	precio_final += 1500;
	
}
	
	return precio_final;
	
 }
}