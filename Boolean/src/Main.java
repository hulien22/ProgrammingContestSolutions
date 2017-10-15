import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		String[] t = input.readLine().split(" ");
		if(t.length%2==1)
			System.out.println(t[t.length-1]);
		else if(t[t.length-1].equals("False"))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
