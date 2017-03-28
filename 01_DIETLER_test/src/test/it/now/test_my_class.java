package test.it.now;

public class test_my_class {

	public static void main(String[] args) {
//		for (int i = -100; i < 100; i++) {
//			System.out.println(((i % 26) + 26) % 26);
//		}
		int maxSize = 1000;
	     ShellSort arr = new ShellSort(maxSize);

	     for (int j = 0; j < maxSize; j++) {
	       long n = (int) (java.lang.Math.random() * 999);
	       arr.insert(n);
	     }
	     arr.display();
	     arr.shellSort();
	     arr.display();		
	}
}