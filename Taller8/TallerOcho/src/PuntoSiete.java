import java.util.Scanner;
public class PuntoSiete {
public class Card {
	String suit, name;
	int points;

Card(int n1, int n2) {
	suit = getSuit(n1);
	name = getName(n2);
	points = getPoints(name);
	Card newCard2 = new Card((int)(Math.random()*4.0+1), (int)(Math.random()*13.0+1));
	int totalPoints = newCard2.points + newCard2.points;
	System.out.println("El valor total de las dos cartas es: " + totalPoints);}

public String toString() {
	return "The " + name + " of " + suit;
	    }

public String getName(int i) {
	if (i == 1) return "Ace";
	if (i == 2) return "Two";
	if (i == 3) return "Three";
	if (i == 4) return "Four";
	if (i == 5) return "Five";
	if (i == 6) return "Six";
	if (i == 7) return "Seven";
	if (i == 8) return "Eight";
	if (i == 9) return "Nine";
	if (i == 10) return "Ten";
	if (i == 11) return "Jack";
	if (i == 12) return "Queen";
	if (i == 13) return "King";
return "error";
	    }

public int getPoints(String n) {
	if (n == "Jack" || n == "Queen" || n == "King" || n == "Ten") return 10;
	if (n == "Two") return 2;
	if (n == "Three") return 3;
	if (n == "Four") return 4;
	if (n == "Five") return 5;
	if (n == "Six") return 6;
	if (n == "Seven") return 7;
	if (n == "Eight") return 8;
	if (n == "Nine") return 9;
	if (n == "Ace") return 1;
	return -1;
	    }

public String getSuit(int i) {
	if (i == 1) return "Diamonds";
	if (i == 2) return "Clubs";
	if (i == 3) return "Spades";
	if (i == 4) return "Hearts";
	return "error";
	    }

public int getPoints() {
	        return points;
	    }
public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    int suitNumber1 = (int)(Math.random() * 4.0 + 1);
    int faceNumber1 = (int)(Math.random() * 13.0 + 1);
    Card card1 = new Card(suitNumber1, faceNumber1);
    System.out.println("Carta 1: " + card1);

    int suitNumber2 = (int)(Math.random() * 4.0 + 1);
    int faceNumber2 = (int)(Math.random() * 13.0 + 1);
    Card card2 = new Card(suitNumber2, faceNumber2);
    System.out.println("Carta 2: " + card2);

    int totalPoints = card1.points + card2.points;
    System.out.println("Total de puntos: " + totalPoints);

    System.out.print("¿Quieres otra carta? (Sí/No) ");
    String answer = scanner.next();

    if (answer.equalsIgnoreCase("Sí")) {
    int suitNumber3 = (int)(Math.random() * 4.0 + 1);
    int faceNumber3 = (int)(Math.random() * 13.0 + 1);
    Card card3 = new Card(suitNumber3, faceNumber3);
    System.out.println("Carta 3: " + card3);
    totalPoints += card3.points;
    System.out.println("Total de puntos: " + totalPoints);
    }
    scanner.close();
    int suitNumber, faceNumber, totalPoints = 0, cardCount = 0;
    boolean continueAdding = true;
    Card newCard;

    while(totalPoints < 21 && continueAdding && cardCount < 5) {
    suitNumber = (int)(Math.random()*4.0+1);
    faceNumber = (int)(Math.random()*13.0+1);
    newCard = new Card(suitNumber,faceNumber);

    System.out.println("You drew: " + newCard);

    totalPoints += newCard.points;
    cardCount++;

    if(totalPoints == 21) {
    System.out.println("Congratulations! You got 21!");
    break;
    } else if(totalPoints > 21) {
    System.out.println("Sorry, you went over 21. You lose!");
    break;
    } else if(cardCount == 5) {
    System.out.println("You have reached the maximum of 5 cards in your hand.");
    break;
    }
    System.out.println("Do you want to draw another card? (y/n)");
    String answer = input.nextLine();

    if(answer.equalsIgnoreCase("n")) {
    continueAdding = false;
     }
  }
  System.out.println("Game over. Your total points: " + totalPoints);
  }
}
}