import java.util.Scanner;


public class Main {

	/**
	 * Practice 2016 Question 1
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (input.hasNextLine()){
			int in = Integer.parseInt(input.nextLine());
			int counter = 0;
			
			for (int top=5;top > 0;top--){
				for (int bot = 5; bot >= 0;bot--){
					if(top+bot==in && top>=bot){
						counter ++;
						break;
					}
				}
			}
			System.out.println(counter);
			input.close();
		}
		
	}

}
