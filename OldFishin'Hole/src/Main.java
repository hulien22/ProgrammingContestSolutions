import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int trout = Integer.parseInt(input.readLine());
		int pike = Integer.parseInt(input.readLine());
		int pickerling = Integer.parseInt(input.readLine());
		int total = Integer.parseInt(input.readLine());
		int v = 0;
		for (int i =0;i<=total/trout;i++){
			for(int j =0;j<=total/pike;j++){
				for(int k = 0;k<=total/pickerling;k++){
					if((i!=0||j!=0||k!=0) & (trout*i+pike*j+pickerling*k<=total)){
						v++;
						System.out.println(i+" Brown Trout, "+j+" Northern Pike, "+k+" Yellow Pickerel");
					}
				}
			}
		}
		System.out.println("Number of ways to catch fish: "+v);
	}
	

}
