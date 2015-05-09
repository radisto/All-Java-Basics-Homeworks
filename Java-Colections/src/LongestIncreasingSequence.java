import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LongestIncreasingSequence {

	public static void main(String[] args) {
		int counter = 0;
		int index = 0;
		int max = 0;
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		Scanner line = new Scanner(str);
		List<Integer> numbers = new ArrayList<Integer>();
		while (line.hasNextInt()) {
			numbers.add(line.nextInt());
		}
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > numbers.get(i-1)) {
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
		for (int i = 0; i < numbers.size(); i++) {
			if (i > 0 && numbers.get(i) <= numbers.get(i-1)) {
				System.out.println();
				System.out.print(numbers.get(i) + " ");
			}
			else {
				System.out.print(numbers.get(i) + " ");
			}
			if (i == numbers.size()-1) {
				System.out.println();
			}
		}
		System.out.print("Longest: ");
		for (int i = index; i <= index + max; i++) {
			System.out.print(numbers.get(i) + " ");
		}
		System.out.println();
		line.close();

	}

}