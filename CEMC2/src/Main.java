import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int max = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		int n = in.nextInt();
		int[] d = new int[n];
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			p[i] = in.nextInt();
		}
		Arrays.sort(d);
		Arrays.sort(p);
		int counter = 0;
		if (q == 1) {
			for (int i = 0; i < d.length; i++) {
				counter += Math.max(d[i], p[i]);

			}
			System.out.println(counter);
		} else {
			/*checkMax(d, p, 0, 0);
			System.out.println(max);*/
			for (int i = 0; i < d.length; i++) {
				counter += Math.max(d[i], p[p.length-i-1]);

			}
			System.out.println(counter);
		}
	}

	public static void checkMax(int[] d, int[] p, int counter, int current) {

		if (counter == p.length) {
			if (current > max) {
				max = current;
			}

		} else {
			int[] p2 = (int[]) p.clone();
			checkMax(d, p2, counter + 1,
					current + Math.max(d[counter], p2[counter]));

			for (int i = counter + 1; i < p.length; i++) {
				swap(p2, counter, i);
				checkMax(d, p2, counter + 1,
						current + Math.max(d[counter], p2[counter]));
			}
		}

	}

	public static void swap(int[] p, int n1, int n2) {
		int temp = p[n1];
		p[n1] = p[n2];
		p[n2] = temp;
	}

}
