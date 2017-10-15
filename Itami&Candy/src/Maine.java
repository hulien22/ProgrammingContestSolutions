import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
public class Maine {
	static long c = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		String[] s = input.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int X = Integer.parseInt(s[1]);
		FindPrime(N,X);
		System.out.println(c);
	}
	public static void FindPrime(int N, int X){
		boolean[] Primes = new boolean[N+1];
		Arrays.fill(Primes, true);
		r:
		for (int i = 2; i<=N;i++){
			if (i%2==0 && i>2)continue r;
			if (Primes[i]==false)continue r;
			for (int j=3;j*j<=i;j+=2){
				if(i%j==0) continue r;
			}
			for (int j=2;i*j<Primes.length;j++) {
                Primes[i*j]=false;
            }
			find2(N-i,X);
		}
	}
	public static void find2(int N, int X){
		for (int i=0;i<=N;i+=X){
			if(N-i>=1)c+= 2;
			else c++;
		}
	}
}
