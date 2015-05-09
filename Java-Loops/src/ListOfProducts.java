import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class ListOfProducts {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Locale.setDefault(new Locale("en", "US"));
		Scanner scanner = new Scanner(new FileReader("input2.txt"));
		Product product = new Product();
		while (scanner.hasNextLine()) {
			String name = scanner.next();
			String price = scanner.next();
			product.list.add(price + " " + name);
		}
		Collections.sort(product.list);
		scanner.close();
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		for (String s : product.list) {
			writer.println(s);
		}
		writer.close();

	}

}

class Product {
	List<String> list = new ArrayList<String>();
}
