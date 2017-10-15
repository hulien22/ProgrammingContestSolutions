import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		o:
		while(true){
			N++;
			for(char i ='0';i<='9';i++){
				if(String.valueOf(N).indexOf(i)!=String.valueOf(N).lastIndexOf(i)){
					continue o;
				}
			}
			break;
		}
		System.out.println(N);
	}

}
