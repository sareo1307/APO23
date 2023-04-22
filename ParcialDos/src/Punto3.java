public class Punto3 {
	
public static void main(String[] args) {

	Libro l1; 
	l1 = new Libro();
	
	Libro2 l2; 
	l2= new Libro2();
	
public int compareTo(Libro l1, Libro2 l2){
	
	if(l1.getNumeropaginas() == l2.getNumeropaginas())
		
	return 0;
	
	if(l1.getNumeropaginas() > l2.getNumeropaginas())
	
	return 1;
	
	return -1;
	
}
}
	