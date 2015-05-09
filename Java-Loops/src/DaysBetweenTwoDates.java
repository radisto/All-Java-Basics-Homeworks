import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class DaysBetweenTwoDates {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		String date1 = scanner.nextLine();
		String date2 = scanner.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("d-MM-yyyy");
		long d1 = format.parse(date1).getTime();
		long d2 = format.parse(date2).getTime();
		System.out.println((d2-d1)/(1000*60*60*24));
		scanner.close();

	}

}
