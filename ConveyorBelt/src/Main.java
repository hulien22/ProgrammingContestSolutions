import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String start = input.readLine();
		String end = input.readLine();
		start = start.concat(start);
		int i = start.indexOf(end);
		if(i<0){
			System.out.println("-1");
		}
		else{
			int right = N-i;
			if(i<=right)System.out.println("L"+i);
			else System.out.println("R"+right);
		}
	}

}
