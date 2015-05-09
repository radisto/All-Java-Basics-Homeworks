import java.util.Locale;
import java.util.Scanner;


public class PointsInsideAFigure {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		if (x >= 12.5 && x <= 17.5 && y >= 6 && y <= 13.5) {
			System.out.println("Inside");
		}
		else if (x > 17.5 && x < 20 && y >= 6 && y <= 8.5) {
			System.out.println("Inside");
		}
		else if (x >= 20 && x <= 22.5 && y <= 6 && y >= 13.5) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
		scanner.close();

	}

}
