import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String in = input.readLine();
		int value =0;
		for (int i = 0; i<in.length();i+=2){
			int num1 = 0;
			int num2 = 0;
			switch (in.substring(i+1, i+2)){
			case "M":
				num1 = 1000;
				break;
			case "D":
				num1 = 500;
				break;
			case "C":
				num1 = 100;
				break;
			case "L":
				num1 = 50;
				break;
			case "X":
				num1 = 10;
				break;
			case "V":
				num1 = 5;
				break;
			case "I":
				num1 = 1;
				break;
			}
			
			int num = Integer.parseInt(in.substring(i,i+1)) * num1;
			
			if (i+2 != in.length()){
				switch (in.substring(i+3, i+4)){
				case "M":
					num2 = 1000;
					break;
				case "D":
					num2 = 500;
					break;
				case "C":
					num2 = 100;
					break;
				case "L":
					num2 = 50;
					break;
				case "X":
					num2 = 10;
					break;
				case "V":
					num2 = 5;
					break;
				case "I":
					num2 = 1;
					break;
				}
				if (num1 < num2){
					num *= -1;
				}
			}
			value += num;
				
		}
		System.out.println(value);
	}

}
