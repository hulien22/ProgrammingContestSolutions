import java.util.Scanner;


public class Main {
public static int max =0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for (int i =0; i<n;i++){
			nums[i] = in.nextInt();
		}
		f(nums);
		System.out.println(max);
		
	}
	
	public static void f(int[] n2){
		int[] n=(int[]) n2.clone();
		for (int i = 1; i<n.length;i++){
			if (n[i] == n[i-1]){
				int[] n5=(int[]) n2.clone();
				int nw = n5[i]*2;
				n5[i-1] = nw;
				for (int j = i;j<n5.length-1;j++){
					swap(n5,j,j+1);
				}
				int[] n3 = new int[n5.length-1];
				for (int j = 0;j<n3.length;j++){
					n3[j]=n5[j];
				}
				f(n3);
			}
			if(i>1){
				if(n[i] == n[i-2]){
					int[] n5=(int[]) n2.clone();
					int nw = n5[i]*2 + n5[i-1];
					n5[i-2] = nw;
					for (int j = i;j<n5.length-1;j++){
						swap(n5,j,j+1);
					}
					for (int j = i-1;j<n5.length-1;j++){
						swap(n5,j,j+1);
					}
					int[] n3 = new int[n5.length-2];
					for (int j = 0;j<n3.length;j++){
						n3[j]=n5[j];
					}
					f(n3);
				}
			}
		}
		for(int i =0; i<n.length;i++){
			if(n[i]>max){
				max = n[i];
			}
		}
	}
	public static void swap(int[] p, int n1, int n2) {
		int temp = p[n1];
		p[n1] = p[n2];
		p[n2] = temp;
	}
}
