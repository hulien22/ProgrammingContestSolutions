import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat("#.000");
		df.setRoundingMode(RoundingMode.HALF_UP);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] s = input.readLine().split(" ");
		int R = Integer.parseInt(s[0]);
		int C = Integer.parseInt(s[1]);
		int[] Xs = new int[C];
		int numX = 0;
		for(int i = 1; i<=R;i++){
			for(int j=0;j<C;j++){
				char t = (char) input.read();
				if(t == 'X'){
					Xs[j] = i;
					numX++;
				}
			}
			input.read();
		}
		if(numX<=1){
			System.out.println("0.000");
			System.exit(0);
		}
		int  prev = -1;
		int cur = -1;
		int dist = 0;
		double angle = 0;
		for(int i =0;i<C;i++){
			dist ++;
			if(Xs[i] > 0){
				prev = cur;
				cur = Xs[i];
				if(prev>0){
					if(cur<=prev){
						angle = 90 - Math.toDegrees(Math.atan(Double.valueOf(prev-cur)/Double.valueOf(dist)));
						System.out.println(df.format(angle));
					}
					else{
						 angle = 180 - Math.toDegrees(Math.atan(Double.valueOf(dist)/Double.valueOf(cur-prev)));
						 System.out.println(df.format(angle));
					}
				}
				dist = 0;
			}
			
		}
	}

}
