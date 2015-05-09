import java.util.Scanner;


public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		int counter = 0;
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String b = Integer.toBinaryString(a);
		for (int i = 0; i < b.length()-1; i++) {
			if (b.charAt(i) == b.charAt(i+1) ) {
				counter++;
			}
		}
		System.out.println(counter);
		scanner.close();

	}

}
