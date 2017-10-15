import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		Integer[] n = new Integer[N];
		for(int i=0;i<N;i++)
			n[i] = input.nextInt();
		input.close();
		Arrays.sort(n);
		for (int i=1;i<N;i++){
			if (i%2==1 && n[i-1]!=n[i]){
					System.out.println(n[i-1]);
					System.exit(0);
				}
		}
		System.out.println(n[n.length-1]);
	}
}