import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SequencesOfEqualStrings {

	public static void main(String[] args) {
		List<String> strlist = new ArrayList<String>();
		Scanner lineScanner = new Scanner(System.in);
		String str = lineScanner.nextLine();
		Scanner stringScanner = new Scanner(str);
		while (stringScanner.hasNext()) {
			strlist.add(stringScanner.next());
		}
		for (int i = 0; i < strlist.size(); i++) {
			if (i>0 && !strlist.get(i).equals(strlist.get(i-1))) {
				System.out.println();
			}
			System.out.print(strlist.get(i) + " ");
		}
		lineScanner.close();
		stringScanner.close();
	}

}
