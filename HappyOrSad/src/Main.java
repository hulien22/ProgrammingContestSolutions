import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		String T = input.readLine();
		int h=0;
		int s=0;
		for(int i=0;i<T.length()-2;i++){
			if(T.substring(i, i+3).equals(":-)"))h++;
			else if(T.substring(i, i+3).equals(":-("))s++;
		}
		if (h==0&&s==0)System.out.println("none");
		else if(h==s)System.out.println("unsure");
		else if(h>s)System.out.println("happy");
		else System.out.println("sad");
	}

}
