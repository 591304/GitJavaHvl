
import java.util.Scanner;

public class Oppg4 {

	public static void main(String[] args) {
		
		double brutto;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Bruttoinntekt er: ");
		brutto = scnr.nextDouble();
		
		double trinn0 = brutto * 1;
		double trinn1 = brutto * 0.019;
		double trinn2 = brutto * 0.042;
		double trinn3 = brutto * 0.132;
		double trinn4 = brutto * 0.162;
		
		if(brutto < 180800) {
			System.out.println("trinnskatten din er: " + trinn0 + " kroner");
		}
		
		else if(brutto > 180800 && brutto < 254500) {
			System.out.println("trinnskatten din er: " + trinn1 + " kroner");
		}
		
		else if(brutto > 254500 && brutto < 639750) {
			System.out.println("trinnskatten din er: " + trinn2 + " kroner");
		}
		
		else if(brutto > 639750 && brutto < 999550) {
			System.out.println("trinnskatten din er: " + trinn3 + " kroner");
		}

		else if(brutto > 999550) {
			System.out.println("trinnskatten din er: " + trinn4 + " kroner");
		}
		
	}

}
