
import java.util.Scanner;

public class Oppg5 {

	public static void main(String[] args) {
		
		int elevPoeng;
		int i = 0;
		
		for(i=1; i<=10; i++) {
			
			Scanner scnr = new Scanner(System.in);
			
			System.out.println("Poengsummen til elev " + i + " er: ");
			elevPoeng = scnr.nextInt();
			
			String A = "A";
			String B = "B";
			String C = "C";
			String D = "D";
			String E = "E";
			String F = "Strøk"; 
			
			
			if(elevPoeng <= 100 && elevPoeng >= 90) {
				System.out.println("Karakteren din er: " + A);
			}
			
			else if(elevPoeng <= 89 && elevPoeng >= 80) {
				System.out.println("Karakteren din er: " + B);
			}
			
			else if(elevPoeng <= 79 && elevPoeng >= 60) {
				System.out.println("Karakteren din er: " + C);
			}
			
			else if(elevPoeng <= 59 && elevPoeng >= 50) {
				System.out.println("Karakteren din er: " + D);
			}
			
			else if(elevPoeng <= 49 && elevPoeng >= 40) {
				System.out.println("Karakteren din er: " + E);
			}
			
			else if(elevPoeng <= 39 && elevPoeng >= 0) {
				System.out.println("Du " + F + ", du er trash");
			}
			
			while(elevPoeng < 0 || elevPoeng > 100) {
				
				System.out.println("Ugyldig poengsum, skriv inn poengsum til elev " + i + " på nytt");
				elevPoeng = scnr.nextInt();
			
			}
			
		}
		
	}
	
}
