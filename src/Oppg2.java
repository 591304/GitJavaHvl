
import javax.swing.JOptionPane;
import java.lang.Integer;


public class Oppg2 {

	public static void main(String[] args) {
		
		int over;
		int under;
		
		under = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn nedre int: "));
		System.out.println("Nedre grense: " + under);
		
		over = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn øvre int: "));
		System.out.println("Øvre grense: " + over);
		
		for (int i = under; under <= i && i <= over; i++) {
			
			if (i%2 == 1) {
			System.out.println("alle oddetall mellom den nedre og øvre grensen er: " + i);
			}
			
		}

	}

}
