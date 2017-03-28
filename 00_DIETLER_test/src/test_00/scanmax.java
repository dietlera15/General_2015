package test_00;

public class scanmax {

	public static void main(String[] args) {
		int[] X = new int[] {31, -41, 59, 26, -53, 58, 97, -93, -23, 84 };
		int scanMax = 0;
		int bisMax = 0;

		for (int i = 0; i < X.length; i++) {
			int a = X[i];
			if ((scanMax + a) > 0) {
				scanMax = scanMax + a;
			} else {
				scanMax = 0;
			}
			bisMax = Math.max(bisMax, scanMax);
		}
		System.out.println("scanMax = " + scanMax);
		System.out.println("bisMax = " + bisMax);
	}
}