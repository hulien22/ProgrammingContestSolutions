import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(input.readLine());
		int Q = Integer.parseInt(input.readLine());
		int W = Integer.parseInt(input.readLine());
		int r = (int) Math.ceil((100*(Q-0.5)-P*(100-W))/W);

		if (r<0)
			System.out.println("0");
		else if (r<=100)
			System.out.println(r);
		else
			System.out.println("DROP THE COURSE");
	}

}
