
public class Libro {
	
    String Titulo;
	
	String Autor;
	
	int Numeropaginas;
	
	int ISBN;

public String Libro (String t, String a, int np,int isbn) {
	
	return ("El libro " + t + "con " + isbn + "ISBN creado por el autor" + a + "tiene " + np + " páginas");
	
}

public void setTitulo (String t) {
	
	Titulo = t;
	
	t = "La rosa";
	
 }

public String getTitulo() {
	
	return Titulo;
	
 }

public void setAutor (String a) {
	
	Autor = a;
	
	a = "Carlos Andres";
	
 }

public String getAutor() {
	
	return Autor;
	
 }

public void setNumeropaginas (int np) {
	
	Numeropaginas = np;
	
	np = 238;
	
 }

public int getNumeropaginas(){
	
	return Numeropaginas;
	
 }

public void setISBN (int isbn) {
	
	ISBN = isbn;
	
	isbn = 18;
	
 }

public int getISBN(){
	
	return ISBN;	
	
 }

 }
