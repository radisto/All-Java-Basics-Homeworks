import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SumNumbersFromATextFile {

	public static void main(String[] args) {
		Scanner scanner;
		try {
			scanner = new Scanner(new FileReader("input.txt"));
			List<Integer> intlist = new ArrayList<Integer>();
				while (scanner.hasNextInt()) {
					intlist.add(scanner.nextInt());
				}
			System.out.println(sumlist(intlist));
			scanner.close();
			} 
		catch (Exception e) {
			System.out.println("Error");
		}
		
	}
	
	public static int sumlist(List<Integer>intlist) {

		int sum = 0;
		for(int i = 0; i<intlist.size(); i++) {
			sum+=intlist.get(i);
		} 
		return sum;
		}

}
