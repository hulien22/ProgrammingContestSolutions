import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		BigInteger N = new BigInteger(s);
		BigInteger out = new BigInteger("1");
		while (!N.equals(BigInteger.ONE)){
			out = out.add(BigInteger.ONE);
			N = N.divide(out);
		}
		System.out.println(out.toString());
	}

}
