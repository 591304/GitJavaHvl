
import java.util.Scanner;
import java.lang.Math;

public class Oppg3 {

	public static void main(String[] args) {
		
		int n;
		double x;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Skriv inn et heltall, n: ");
		n = scnr.nextInt();
		
		System.out.println("Skriv inn et flytall, x: ");
		x = scnr.nextDouble();
		
		System.out.println("x^n = " + Math.pow(x, n));

	}

}
