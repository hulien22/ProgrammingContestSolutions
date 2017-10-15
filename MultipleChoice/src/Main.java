import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String[] q = new String[N];
		int val = 0;
		for(int i =0;i<N;i++)q[i]=input.readLine();
		for(int i =0;i<N;i++)if(input.readLine().equals(q[i])) val++;
		System.out.println(val);
	}

}
