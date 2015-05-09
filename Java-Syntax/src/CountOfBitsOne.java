import java.util.Scanner;


public class CountOfBitsOne {

	public static void main(String[] args) {
		int counter = 0;
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String b = Integer.toBinaryString(a);
		for (char ch : b.toCharArray()) {
			if (ch == '1') {
				counter++;
			}
		}
		System.out.println(counter);
		scanner.close();
	}

}
