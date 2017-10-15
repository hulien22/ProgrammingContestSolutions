import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] t = input.readLine().split(" ");
		int N = Integer.parseInt(t[0]);
		int M = Integer.parseInt(t[1]);
		int value =0;
		String[][] boxes = new String[M][4];
		for (int i=0;i<M;i++){
			boxes[i] = input.readLine().split(" ");
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				int c = 1;
				for(String[] k:boxes){
					if (i>=Integer.parseInt(k[0]) && i<Integer.parseInt(k[0])+Integer.parseInt(k[2]) &&  j>=Integer.parseInt(k[1]) && j<Integer.parseInt(k[1])+Integer.parseInt(k[3])){
						c*=-1;
					}
				}
				if(c<0)
					value++;
			}
		}
		System.out.println(value);
	}

}
