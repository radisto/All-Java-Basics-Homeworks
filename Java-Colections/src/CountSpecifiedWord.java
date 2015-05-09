import java.util.Scanner;


public class CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		String string = input.nextLine();
		String specword = input.next();
		String[] words = string.split("\\W+");
		for (String word : words) {
			if (specword.equalsIgnoreCase(word)) {
				counter++;
			}
		}
		System.out.println(counter);
		input.close();

	}

}
