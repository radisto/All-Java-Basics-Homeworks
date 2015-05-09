import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] myarray = new int[n];
		for (int i = 0; i < n; i++) {
			myarray[i] = scanner.nextInt();
		}
		Arrays.sort(myarray);
		for (int i : myarray) {
			System.out.print(i + " ");
		}
		scanner.close();
	}

}
