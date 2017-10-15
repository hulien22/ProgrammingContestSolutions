import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int[] a = new int[] {1,64,729,4096,15625,46656,117649,262144,531441,1000000,1771561,2985984,4826809,7529536,11390625,16777216,24137569,34012224,47045881,64000000,85766121};
		int counter = 0;
		for(int i=0;i<21;i++){
			if(a[i]>=A && a[i]<=B) counter++;
			else if(a[i]>B)break;
		}
		System.out.println(counter);
	}

}