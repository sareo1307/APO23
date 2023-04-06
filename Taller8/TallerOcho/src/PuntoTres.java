
public class PuntoTres {
public class Animal {
	public static void main(String[] args) {
}
	int weight, height;
	double speed;
	Animal animal1 = new Animal();
    Animal animal2 = new Animal(70, 5, 4);
        
Animal() {
	weight = 50;
	height = 4;
	speed = 2; //miles per hour
	}

Animal(int w, int h, int s ) {
	weight = w;
	height = h;
	speed = s;
	}

public double getTime(double miles) {
	return miles/speed;
	}

public int getWeight() {
	return weight;
	}

public int getHeight() {
	return height;
	}

public double getSpeed() {
	
	System.out.println("El animal 1 tiene una velocidad de " + animal1.getSpeed() + ".");
		
	System.out.println("El animal 2 tiene una velocidad de " + animal2.getSpeed() + ".");
		
	return speed;
  }
 }
}
