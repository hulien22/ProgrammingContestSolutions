import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		for (int i =0;i<N;i++){
			String[] in = input.readLine().split(" ");
			BigInteger AB = new BigInteger(in[0]);
			BigInteger B = new BigInteger(in[1]);
			AB = AB.multiply(B);
			BigInteger R = new BigInteger(in[2]);
			if (R.equals(AB)){
				System.out.println("POSSIBLE DOUBLE SIGMA");
			}
			else{
				System.out.println("16 BIT S/W ONLY");
			}
		}
	}


}
