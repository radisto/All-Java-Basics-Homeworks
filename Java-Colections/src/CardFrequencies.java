import java.util.Locale;
import java.util.Scanner;


public class CardFrequencies {

	public static void main(String[] args) {
		int counter = 1;
		Locale.setDefault(new Locale("en", "US"));
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] cards = line.split("\\W+"); 
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				if (j == (cards.length-1)) {
					if (cards[i].equals(cards[j])) {
						if (j > i) {
							counter++;
						}
					}
					System.out.println(cards[i] + " -> " + String.format( "%.2f", (double) counter / cards.length * 100 )+ "%");
					counter = 1;
				}
				if (cards[i].equals(cards[j])) {
					if (i == j) {
						continue;
					}
					else if (i > j) {
						break;
					}
					else {
						counter++;
					}
				}
			}
		}
		input.close();

	}

}
