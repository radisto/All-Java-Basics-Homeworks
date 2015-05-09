import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		int counter = 0;
		int index = 0;
		int max = 0;
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		Scanner line = new Scanner(str);
		List<String> words = new ArrayList<String>();
		while (line.hasNext("\\w+")) {
			words.add(line.next("\\w+"));
		}
		for (int i = 1; i < words.size(); i++) {
			if (words.get(i).equals(words.get(i-1))) {
				counter++;
				if (counter > max) {
					index = i-counter;
					max = counter;
				}
			}
			else {
				counter = 0;
			}
		}
		for (int i = index; i <= index + max; i++) {
			System.out.print(words.get(i) + " ");
		}
		System.out.println();
		line.close();

	}

}
