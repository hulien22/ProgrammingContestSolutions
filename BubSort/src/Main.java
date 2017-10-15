import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String[] in = input.readLine().split(" ");
		int[] a = new int[N];
		for(int i=0;i<N;i++)
			a[i] = Integer.parseInt(in[i]);
		boolean swapped = false;
		for (int i=0;i<N;i++){
			for(int j=0;j<N-1;j++){
				if (a[j]>a[j+1]){
					swapped = true;
					a = swap(a,j,j+1);
				}
			}
			if(swapped == false)
				break;
			else
				swapped = false;
		}
		for (int i =0;i<a.length-1;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print(a[a.length-1]+"\n");
	}
	public static int[] swap(int[] a,int s,int t){
		for (int i =0;i<a.length-1;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print(a[a.length-1]+"\n");
		int temp = a[s];
		a[s] = a[t];
		a[t] = temp;
		return a;
	}
	

}
