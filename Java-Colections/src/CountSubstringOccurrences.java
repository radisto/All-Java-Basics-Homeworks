import java.util.Scanner;


public class CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		String string = input.nextLine().toLowerCase();
		String specword = input.next().toLowerCase();
		String[] words = string.split("\\W+");
		for (String word : words) {
			if (word.contains(specword)) {
				counter++;
			}
		}
		System.out.println(counter);
		input.close();

	}

}
