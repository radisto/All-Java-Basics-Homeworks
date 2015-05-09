import java.util.Scanner;


public class SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String c = null;
		for (int i = a; i <= b; i++) {
			c = Integer.toString(i);
			if (i<10) {
				System.out.print(i + " ");
			}
			else if (i<100) {
				if (c.charAt(0) == c.charAt(1)) {
					System.out.print(i + " ");
				}
			}
			else {
				if (c.charAt(0) == c.charAt(2)) {
					System.out.print(i + " ");
				}
			}
		}
		scanner.close();
	}

}
