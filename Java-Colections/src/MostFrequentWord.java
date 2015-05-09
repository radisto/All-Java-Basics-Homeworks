import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MostFrequentWord {

	public static void main(String[] args) {
		int counter = 1;
		List<String> output = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String line = input.nextLine().toLowerCase();
		String[] words = line.split("[^a-z]+"); 
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (j == (words.length-1)) {
					if (counter > 1) {
						output.add(words[i] + " -> " + Integer.toString(counter) + " times");
					}
					counter = 1;
				}
				if (words[i].equals(words[j])) {
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
		Collections.sort(output);
		for (String word : output) {
			System.out.println(word);
		}
		input.close();

	}

}
