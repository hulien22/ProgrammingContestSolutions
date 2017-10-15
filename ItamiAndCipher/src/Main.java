import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		String S = input.readLine();
		String T = input.readLine();
		int c=0;
		while(true){
			if(S.contains(T)){
				System.out.println(c+"\n"+S);
				System.exit(0);
			}
			S=decipher(S);
			c++;
		}
	}
	public static String decipher(String T){
		String t="";
		for (int i=0;i<T.length();i++){
			if(T.charAt(i) == 'a')t+="z";
			else t+=(char)(T.charAt(i)-1);
		}
		return(t);
	}
}
