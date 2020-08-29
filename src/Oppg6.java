
import java.util.Scanner;

public class Oppg6 {

	public static void main(String[] args) {
		
		int n;
		int x = 1;
		
		
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Skriv et heltall, n: ");
		n = scnr.nextInt();
		
		while(n <= 0) {
			
			System.out.println("n MÅ være større enn 0!!!!!!");	
			n = scnr.nextInt();
		}
		
		if(n > 0) {
			
			 int a = n;
			
			while (n > 0) {
				
				x *= n;
				n--;
				
			}
			
			System.out.println(a + "! = " + x);
		
		}


	}

}
