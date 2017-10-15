import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine().toLowerCase();
		String[] alp = {"@","8","(","|)","3","#","6","[-]","|","_|","|<","1","[]\\/[]","[]\\[]","0","|D","(,)","|Z","$","']['","|_|","\\/","\\/\\/","}{","`/","2"};
		String out = "";
		int j;
		for(int i = 0;i<s.length();i++){
			j = s.charAt(i) - 97;
			if (j>=0 && j<= 25){
				out+= alp[j];
			}
			else{
				out += s.charAt(i);
			}
		}
		System.out.println(out);
	}

}
