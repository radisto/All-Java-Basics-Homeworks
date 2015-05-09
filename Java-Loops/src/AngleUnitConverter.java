import java.util.Locale;
import java.util.Scanner;


public class AngleUnitConverter {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			double current = scanner.nextDouble();
			String unit = scanner.next();
			if (unit.equals("deg")) {
				System.out.println(String.format("%.6f",current*0.0174532925) + " rad");
			}
			else if (unit.equals("rad")) {
				System.out.println(String.format("%.6f",current*57.2957795) + " deg");
			}
		}
		scanner.close();

	}

}
