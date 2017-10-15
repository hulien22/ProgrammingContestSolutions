import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] s = input.readLine().split(" ");
		int C = Integer.parseInt(s[0]);
		int R = Integer.parseInt(s[1]);
		long M = Long.parseLong(s[2]);
		long Q = Long.parseLong(s[3]);
		long[] col = new long[C];
		long[] row = new long[R];
		Arrays.fill(col, 1);
		Arrays.fill(row, 1);
		for(long i = 0;i<M;i++){
			s = input.readLine().split(" ");
			if (s[0].equals("c")){
				try {
					for(int j = Integer.parseInt(s[1])-1;j<Long.parseLong(s[2]);j++){
						col[j]*= Long.parseLong(s[3]);
					}
				} catch (Exception e) {}
			}
			else{
				try {
					for(int j = Integer.parseInt(s[1])-1;j<Long.parseLong(s[2]);j++){
						row[j]*= Long.parseLong(s[3]);
					}
				} catch (Exception e) {}
			}
		}
		long val;
		for (int i =0;i<Q;i++){
			s = input.readLine().split(" ");
			val = 0;
			for(int j=0;j<R;j++){
				for(int k = 0;k<C;k++){
					if(row[j]*col[k]*Long.parseLong(s[0])==Long.parseLong(s[1])){
						val++;
					}
				}
			}
			System.out.println(val);
		}
		
	}

}
