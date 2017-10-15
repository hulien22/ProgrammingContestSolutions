import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Zain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String[] b = new String[N];
		for(int i =0;i<N;i++)b[i]=input.readLine();
		int Q = Integer.parseInt(input.readLine());
		ArrayList<String> w = new ArrayList<String>(Q);
		int v = 0;
		String[] in = new String[2];
		int[] m = new int[N];
		for(int i =0;i<Q;i++){
			in = input.readLine().split(" ");
			if(in[0].equals("1")){
				w.add(in[1]);
				m = new int[N];
			}
			else{
				if(m[Integer.parseInt(in[1])-1]>0)System.out.println(m[Integer.parseInt(in[1])-1]-1);
				else{
					v =0;
					for(int j=0;j<w.size();j++)if(w.get(j).contains(b[Integer.parseInt(in[1])-1])) v++;
					System.out.println(v);
					m[Integer.parseInt(in[1])-1] = v+1;
				}
			}
		}
		
	}

}
