
public class PuntoUno {
	public static void main(String[] args) {
		
public class Forma2D {
	private int numSides;
	private boolean regular;
	    
public Forma2D(int numSides, boolean regular) {
	this.numSides = numSides;
	this.regular = regular;
	}
	    
public Forma2D(int numSides) {
	this(numSides, false); 
	}
	    
public int getNumSides() {
	return numSides;
	}
	    
public void setNumSides(int numSides) {
	this.numSides = numSides;
	}
	    
public boolean isRegular() {
	return regular;
	}
	    
public void setRegular(boolean regular) {
	this.regular = regular;
	    }
	}
}
}