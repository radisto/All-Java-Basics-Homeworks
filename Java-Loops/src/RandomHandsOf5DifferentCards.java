import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class RandomHandsOf5DifferentCards {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			randomCard();
		}
		scanner.close();
	}
	
	public static void randomCard() {
		String[] hand = new String[5];
		String card = null;
		String suit = null;
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int randomcard = random.nextInt(13)+2;
			switch (randomcard) {
			case 11:
				card = "J";
				break;
			case 12:
				card = "Q";
				break;
			case 13:
				card = "K";
				break;
			case 14:
				card = "A";
				break;
			default:
				card = Integer.toString(randomcard);
				break;
			}
			int randomsuit = random.nextInt(4);
			switch (randomsuit) {
			case 0:
				suit = "♣";
				break;
			case 1:
				suit = "♦";
				break;
			case 2:
				suit = "♥";
				break;
			case 3:
				suit = "♠";
				break;
			}
			hand[i] = card + suit;
			for (int j = i; j > 0; j--) {
				if (hand[i].equals(hand[j-1])) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(hand));
	}

}
