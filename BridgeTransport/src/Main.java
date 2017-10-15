import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int W = Integer.parseInt(input.readLine());
		int N = Integer.parseInt(input.readLine());
		int[] trains = new int[]{0,0,0,0};
		for (int i = 0; i<N;i++){
			trains[3] = trains[2];
			trains[2] = trains[1];
			trains[1] = trains[0];
			trains[0] = Integer.parseInt(input.readLine());
			if(trains[0]+trains[1]+trains[2]+trains[3] > W){
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println(N);
	}

}
