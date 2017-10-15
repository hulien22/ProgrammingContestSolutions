import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		HashMap<String,String> h = new HashMap<String,String>();
		for(int i =0;i<N;i++){
			String[] s = input.readLine().split(" ");
			h.put(s[1],s[0]);
		}
		String text = input.readLine();
		out(h,text);
	}
	public static void out(HashMap<String,String>h,String text){
		for(int i = 1;i<=text.length();i++){
			if(h.containsKey(text.substring(0, i))){
				System.out.print(h.get(text.substring(0, i)));
				text = text.substring(i);
				out(h,text);
				break;
			}
		}
	}
}
