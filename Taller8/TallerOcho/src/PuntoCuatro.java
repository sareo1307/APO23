
public class PuntoCuatro {
	public static void main(String[] args) {
public class Estudiante {
	private String nombre;
	private int creditos;
	private double gpa;
	private double puntosCalidad;
	    
public Estudiante(String nombre) {
	
	Estudiante mary = new Estudiante("Mary Jones");
	Estudiante john = new Estudiante("John Stiner");
	Estudiante ari = new Estudiante("Ari Samala");
	
	this.nombre = nombre;
	this.creditos = 0;
	this.gpa = 0.0;
	this.puntosCalidad = 0.0;
}
	    
public double obtenerPromedioPonderado() {
	if (this.creditos == 0) {
	return 0.0;
} else {
	return this.puntosCalidad / this.creditos;
}
}
	    
public void actualizarCalificaciones(int creditos, double puntos) {
	this.creditos += creditos;
	this.puntosCalidad += puntos;
	this.gpa = obtenerPromedioPonderado();
	Estudiante ari = null;
	
	ari.actualizarCalificaciones(this.creditos + 13,this.puntosCalidad + 52);
	
}
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	
	System.out.println("Mary Jones" );
	System.out.println("John Stiner" );
	System.out.println("Ari Samala" );
	
	this.nombre = nombre;
}

 public int getCreditos() {
	 int creditos = 14;
	 creditos = 60;
	 creditos = 31;
	return creditos;
}

public void setCreditos(int creditos) { 
	this.creditos = creditos;
	System.out.println("Mary Jones tiene " + creditos + "creditos");
	System.out.println("John Stiner tiene " + creditos + "creditos");
	System.out.println("Ari Samala tiene " + creditos + "creditos");
	
	this.creditos = creditos;
}

public double getGpa() {
	return gpa;
}

public void setGpa(double gpa) {
	this.gpa = gpa;
}

public double getPuntosCalidad() {
	double puntosCalidad = 46;
	puntosCalidad = 173;
	puntosCalidad = 69;
	
	return puntosCalidad;
}

public void setPuntosCalidad(double puntosCalidad) {
	
	System.out.println("Mary Jones tiene" + puntosCalidad + "puntos de calidad");
	System.out.println("John Stiner tiene" + puntosCalidad + "puntos de calidad");
	System.out.println("Ari Samala tiene" + puntosCalidad + "puntos de calidad");
	
	this.puntosCalidad = puntosCalidad;
  }
 }
}
}