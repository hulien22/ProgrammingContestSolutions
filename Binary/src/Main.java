import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		for (int i = 0;i<N;i++){
			int q = Integer.parseInt(input.readLine());
			String o = Integer.toBinaryString(q);
			while (o.length()%4 != 0){
				o = "0"+o;
			}
			for (int j=0;j<o.length();j++){
				if(j!=0 && j%4==0)
					System.out.print(" ");
				System.out.print(o.substring(j, j+1));
			}
			System.out.print("\n");
	}
	}
}
