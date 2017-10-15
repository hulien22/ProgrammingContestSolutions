import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		if(N==0)System.exit(0);
		else if(N==1){
			String[] s = input.readLine().split(" ");
			System.out.println(s[0]);
		}
		else{
			int M = 0;
			int m = 0;
			String sM ="";
			String sm = "";
			for(int i=0;i<N;i++){
				String[] s = input.readLine().split(" ");
				int val = Integer.parseInt(s[1])*2 + Integer.parseInt(s[2])*3 + Integer.parseInt(s[3]);
				if(val> M){
					m=M;
					sm =sM;
					M = val;
					sM = s[0];
				}
				else if(val==M){
					if(s[0].compareTo(sM) < 0){
						m=M;
						sm =sM;
						M = val;
						sM = s[0];
					}
					else if(val == m){
						if(s[0].compareTo(sm) < 0){
							m = val;
							sm = s[0];
						}
					}
					else{
						m = val;
						sm = s[0];
					}
				}
				else if(val>m){
					m = val;
					sm = s[0];
				}
				else if(val==m){
					if(s[0].compareTo(sm) < 0){
						m = val;
						sm = s[0];
					}
				}
			}
			System.out.println(sM);
			System.out.println(sm);
		}
	}

}
