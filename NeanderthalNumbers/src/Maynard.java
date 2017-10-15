import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Maynard {
	public static HashMap<String,Integer> hm = new HashMap<String,Integer>();
	public static final String[] w = new String[] { "ug","ook","oog", "ugug",  "ooga", "mook", "oogam", "oogum", "ookook", "mookmook" };
	
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String in = "";
		for(int i =0;i<10;i++){
			in = input.readLine();
			System.out.println(find(in));
		}
	}
	public static int find(String s){
		if(hm.containsKey(s)) return hm.get(s);
		else if(s.length()==0){
			return 1;
		}
		else{
			int val = 0;
			for(int i = 0;i<w.length;i++){
				if(w[i].length()>s.length()) break;
				else if(w[i].length()<=s.length() && s.startsWith(w[i])){
					val += find(s.substring(w[i].length()));
				}
			}
			hm.put(s, val);
			return val;
		}
	}
}
