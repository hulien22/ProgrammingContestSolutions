import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		String[] a = input.readLine().split(" ");
		String[] b = input.readLine().split(" ");
		o:
		for (int i = 0;i<N;i++){
			if(a[i].equals(b[i])){
				System.out.println("bad");
				System.exit(0);
			}
			for (int j=0;j<N;j++){
				if(b[i].equals(a[j])&&a[i].equals(b[j]))continue o;
			}
			System.out.println("bad");
			System.exit(0);
		}
		System.out.println("good");
	}

}
