import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
public class MainMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		HashMap<Integer, Integer> F = new HashMap<Integer,Integer>();
		for (int i = 0;i<N;i++){
			String[] s =  input.readLine().split(" ");
			F.put(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
		}
		String[] a = input.readLine().split(" ");
		r:
		while(true){
			int n1 = Integer.parseInt(a[0]);
			int n2 = Integer.parseInt(a[1]);
			if(n1==0&&n2==0)
				System.exit(0);
			int check = 0;
			ArrayList<Integer> f = new ArrayList<Integer>();
			while(true){
			    try{
				if(F.get(n1) == n2){
					System.out.println("Yes " + check);
					 a = input.readLine().split(" ");
					continue r;
				}
				else{
					check++;
					f.add(n1);
					n1 = F.get(n1);
					if(f.contains(n1)){
						System.out.println("No");
						a = input.readLine().split(" ");
						continue r;
					}
				}
			    }
				catch(Exception e){
				    System.out.println("No");
						a = input.readLine().split(" ");
						continue r;
				}
			}
		}
	}
	
}