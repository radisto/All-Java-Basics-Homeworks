import java.util.Locale;
import java.util.Scanner;


public class TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = (a>b ? b : a);
		double e = (c>d ? d : c);
		if (e % 1 == 0) {
			System.out.println((int)e);
		}
		else {
			System.out.println(e);
		}
		scanner.close();

	}

}
