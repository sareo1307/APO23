package poo;

public class Nave {
	
	private int motor;
	
	private int alas;
	
	private int peso;
	
	private Boolean cabina, propulsores;
	
public Nave(){
	
	motor = 1;
	
	alas = 2;
	
	peso = 2900;
	
}

public String dime_datos_generales(){
	
	return "La Nave tiene " + motor + "motor " + ". Pesa " + peso + " toneladas " + " tiene " + alas + " alas ";

}

public void establecer_cabina(String cabina_Nave) {
	
	if(cabina_Nave == "si"){
		
		this.cabina = true;
		
	}else{
				
		this.cabina = false;
		
}
}
	
public String dime_cabina() {
	
	if (this.cabina == true) {
		
		return "La nave tiene cabina";
		
	}else{
			
		return "La nave no tiene cabina";
				
}
}
	
public void establecer_propulsores(String propulsores_Nave) {

	if(propulsores_Nave == "si"){
		
		this.propulsores = true;
		
	}else{
				
		this.propulsores = false;
		
}
}
	
public String dime_propulsores() {
	
	if (this.propulsores == true) {
		
		return "La nave tiene propulsores";
		
	}else{
			
		return "La nave no tiene propulsores";
				
}
}

}


