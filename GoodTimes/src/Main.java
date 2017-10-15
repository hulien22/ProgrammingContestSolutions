import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(input.readLine());
		System.out.println(N +" in Ottawa");
		int n2 = N - 300;
		if(n2<0) n2+=2400;
		System.out.println(n2+" in Victoria");
		n2 = N - 200;
		if(n2<0) n2+=2400;
		System.out.println(n2+" in Edmonton");
		n2 = N - 100;
		if(n2<0) n2+=2400;
		System.out.println(n2+" in Winnipeg");
		System.out.println(N+" in Toronto");
		n2 = N + 100;
		if(n2>=2400) n2-=2400;
		System.out.println(n2+" in Halifax");
		int min = n2%100;
		if(min<30) n2 += 30;
		else{
			n2 += 100;
			n2 -= 30;
			if(n2>=2400) n2-=2400;
		}
		System.out.println(n2+" in St. John's");
	}

}
