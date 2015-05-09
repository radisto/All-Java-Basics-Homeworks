import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line = input.nextLine().toLowerCase();
		String[] toarray = line.split("\\W+");
		Set<String> words = new TreeSet<>(Arrays.asList(toarray));
		for (String word : words) {
			System.out.println(word);
		}
		input.close();

	}

}
