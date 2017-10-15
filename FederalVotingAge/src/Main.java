import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		for(int i =0;i<N;i++){
			String[] s = input.readLine().split(" ");
			int year = Integer.parseInt(s[0]);
			int month = Integer.parseInt(s[1]);
			int day = Integer.parseInt(s[2]);
			if (year>1989)System.out.println("No");
			else if (year<1989)System.out.println("Yes");
			else{
				if(month == 1) System.out.println("Yes");
				else if (month == 2 && day <= 27) System.out.println("Yes");
				else System.out.println("No");
			}
		}
	}

}
