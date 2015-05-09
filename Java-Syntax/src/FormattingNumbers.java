import java.util.Locale;
import java.util.Scanner;


public class FormattingNumbers {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		System.out.print('|');
		String hex = Integer.toHexString(a).toUpperCase();
		System.out.print(hex + "          ".substring(hex.length()));
		System.out.print('|');
		String bin = Integer.toBinaryString(a);
		System.out.print("0000000000".substring(bin.length()) + bin);
		System.out.print('|');
		String b2 = String.format("%.2f", b);
		System.out.print("          ".substring(b2.length()) + b2);
		System.out.print('|');
		String c2 = String.format("%.3f", c);
		System.out.print(c2 + "          ".substring(c2.length()));
		System.out.print('|');
		scanner.close();

	}

}
