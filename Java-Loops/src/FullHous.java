
public class FullHous {

	public static void main(String[] args) {
		int counter = 0;
		String[] a = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		char[] b = {'♠', '♥', '♦', '♣'};
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 13; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 0; k < 2; k++) {
					for (int m = k+1; m < 3; m++) {
						for (int n = m+1; n < 4; n++) {
							for (int l = 0; l < 3; l++) {
								for (int p = l+1; p < 4; p++) {
									System.out.println(a[i]+b[k]+" "+a[i]+b[m]+" "+a[i]+b[n]+" "+a[j]+b[l]+" "+a[j]+b[p]);
									counter++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(counter);

	}

}
