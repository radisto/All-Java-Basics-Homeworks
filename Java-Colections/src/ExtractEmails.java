import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExtractEmails {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		Scanner line = new Scanner(str);
		List<String> emails = new ArrayList<String>();
		while (line.hasNext()) {
			String current = line.next();
			if (isitvalid(current)) {
				emails.add(current);
			}
		}
		for (String email : emails) {
			System.out.println(email);
		}
		input.close();
		line.close();

	}
	
	public static boolean isitvalid(String email) {
        String ePattern = "([a-z]+[\\.])?[a-z]+[@][a-z]+[\\.][a-z]+([\\.][a-z]+)?";
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(email);
        return m.matches();
	}

}
