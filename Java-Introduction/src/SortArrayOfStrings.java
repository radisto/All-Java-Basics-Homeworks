import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		String[] Str = new String[n];
		for (int i = 0; i < n; i++) {
			Str[i] = scr.next();
		}
		Arrays.sort(Str);
		for (String s : Str) {
			System.out.println(s);
		}
		scr.close();
	}

}
