import java.util.Locale;
import java.util.Scanner;


public class PointsInsideTheHouse {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		if (x>=12.5 && x<=17.5 && y>=8.5 && y<=13.5) {
			System.out.println("Inside");
		}
		else if (x>=20 && x<=22.5 && y>=8.5 && y<=13.5) {
			System.out.println("Inside");
		}
		else if (x>=12.5 && x<=17.5 && y>=3.5 && y<=8.5 && isLeft(x, y, 17.5, 3.5, 12.5, 8.5)) {
			System.out.println("Inside");
		}
		else if (x>=17.5 && x<=22.5 && y>=3.5 && y<=8.5 && isRight(x, y, 22.5, 8.5, 17.5, 3.5)) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
		scanner.close();

	}
	public static boolean isLeft(double ax, double ay, double bx, double by, double cx, double cy){
	     return ((bx - ax)*(cy - ay) - (by - ay)*(cx - ax)) >= 0;
	}
	public static boolean isRight(double ax, double ay, double bx, double by, double cx, double cy){
	     return ((bx - ax)*(cy - ay) - (by - ay)*(cx - ax)) <= 0;
	}

}
