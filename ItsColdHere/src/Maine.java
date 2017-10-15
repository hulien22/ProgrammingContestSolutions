import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Maine {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner input = new Scanner(System.in);
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		while (input.hasNext()){
			String[] s = input.nextLine().split(" ");
			h.put(Integer.parseInt(s[1]), s[0]);
		}
		for(int i =-273;i<=200;i++){
			if(h.containsKey(i)){
				System.out.println(h.get(i));
				System.exit(0);
			}
		}
	}

}
