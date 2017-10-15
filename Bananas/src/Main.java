import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String word = input.readLine();
			if (word.equals("X"))
				System.exit(0);
			/*int b =0;
			for (int i=0;i<word.length();i++){
				if (word.charAt(i)=='B')
					b++;
				else if(word.charAt(i)=='S')
					b--;
			}
			if(b!=0)
				word ="Q";*/
			boolean a = isMonkey(word);
			if(a==true)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
	}
	public static boolean isMonkey(String word){
		if (word.length()==1){
			if (word.equals("A"))
				return true;
			else
				return false;
		}
		else if (word.length()==2)
			return false;
		if(word.contains("BAS"))
			return isMonkey(word.replace("BAS", "A"));
		else if(word.contains("ANA"))
			return isMonkey(word.replace("ANA", "A"));
		return false;
	}
}
