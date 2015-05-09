import java.util.Scanner;


public class Generate3LetterWords {

	public static void main(String[] args) {
		String result  = "";
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		char[] chacha = new char[input.length()];
		for (int i = 0; i < chacha.length; i++) {
			chacha[i] = input.charAt(i);
		}
		for (int i = 0; i < chacha.length; i++) {
			for (int j = 0; j < chacha.length; j++) {
				for (int k = 0; k < chacha.length; k++) {
					result = "" + chacha[i] + chacha[j] + chacha[k];
					System.out.println(result);
				}
			}
		}
		scanner.close();

	}

}
