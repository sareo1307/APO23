package poo;

public class UsoCoche {

	public static void main(String[] args) {
		
		Coche Renault = new Coche();
		
		System.out.println(Renault.dime_datos_generales());
		
		Renault.establecer_color("verde");
		
		System.out.println(Renault.dime_color());
		
		Renault.configurar_asientos("si");
		
		System.out.println(Renault.dime_asientos());
		
		System.out.println(Renault.dime_peso_total());

	}

}
