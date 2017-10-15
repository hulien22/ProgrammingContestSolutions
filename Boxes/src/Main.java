import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String[][] b = new String[N][3];
		for (int i =0;i<N;i++) b[i] = input.readLine().split(" ");
		N = Integer.parseInt(input.readLine());
		for (int i=0;i<N;i++){
			long min = 8000000001l;
			String[] s = input.readLine().split(" ");
			for(int j=0;j<b.length;j++){
				long a = Check(b[j],s);
				if(a<min) min = a;
			}
			if(min<8000000001l) System.out.println(min);
			else System.out.println("Item does not fit.");
		}
	}
	public static long Check(String[] b, String[] d){
		int A = Integer.parseInt(b[0]);
		int B = Integer.parseInt(b[1]);
		int C = Integer.parseInt(b[2]);
		int D = Integer.parseInt(d[0]);
		int E = Integer.parseInt(d[1]);
		int F = Integer.parseInt(d[2]);
		if((D<=A&&E<=B&&F<=C)||(D<=A&&F<=B&&E<=C)||(E<=A&&D<=B&&F<=C)||(F<=A&&D<=B&&E<=C)||(E<=A&&F<=B&&D<=C)||(F<=A&&E<=B&&D<=C)){
			return A*B*C;
		}
		return 8000000001l;
	}
}
