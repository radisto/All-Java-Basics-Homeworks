import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ax = scanner.nextInt();
		int ay = scanner.nextInt();
		int bx = scanner.nextInt();
		int by = scanner.nextInt();
		int cx = scanner.nextInt();
		int cy = scanner.nextInt();
		double ccx = (ax > bx) ? ax-bx : bx-ax;
		double ccy = (ay > by) ? ay-by : by-ay;
		double c = Math.sqrt(ccx*ccx + ccy*ccy);
		double aax = (bx > cx) ? bx-cx : cx-bx;
		double aay = (by > cy) ? by-cy : cy-by;
		double a = Math.sqrt(aax*aax + aay*aay);
		double bbx = (ax > cx) ? ax-cx : cx-ax;
		double bby = (ay > cy) ? ay-cy : cy-ay;
		double b = Math.sqrt(bbx*bbx + bby*bby);
		double p = (a+b+c)/2;
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println(Math.round(s));
		scanner.close();

	}

}
