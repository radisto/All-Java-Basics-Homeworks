import java.util.Scanner;


public class CountAllWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		String[] words = string.split("\\W+");
		System.out.println(words.length);
		input.close();

	}

}
