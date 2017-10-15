import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		int[] q = new int[N];
		for (int i=0;i<N;i++)
			q[i] = Integer.parseInt(input.readLine());
		String[] t = input.readLine().split(" ");
		int mC = 0;
		for (int i = 0; i<t.length;){
			int max = q[mC++%q.length];
			String temp = t[i];
			if(temp.length()==max || temp.length()+1 == max){
				System.out.println(temp);
				i++;
			}
			else if(temp.length() < max){
				while((temp.length()!= max || temp.length()+1!= max)){
					String temp2 = temp;
					i++;
					if(i==t.length)
						break;
					temp += " " + t[i];
					if(temp.length() > max){
						//System.out.println(max + "!!! " + temp + " " + temp2);
						temp=temp2;
						break;
					}
				}
				System.out.println(temp);
			}
			else{
				//temp.length>max
				System.out.println(temp.substring(0, max));
				//temp = temp.substring(max);
				int low = max;
				int high = max;
				max = q[mC++%q.length];
				high += max;
				//System.out.println(high + "   " + low);
				while(temp.length() - low > max){					
					System.out.println(temp.substring(low, high));
					low += max;
					max = q[mC++%q.length];
					high += max;
				}
				temp = temp.substring(low);
				
				if(temp.length()==max || temp.length()+1 == max){
					System.out.println(temp);
					i++;
				}
				else if(temp.length() < max){
					while(temp.length()!= max || temp.length()+1!= max ){
						String temp2 = temp;
						i++;
						if(i==t.length)
							break;
						temp += " " + t[i];
						if(temp.length() > max){
							//System.out.println(max + "!!! " + temp + " " + temp2);
							temp=temp2;
							break;
						}
					}
					System.out.println(temp);
				}
			}
			
		}
	}

}