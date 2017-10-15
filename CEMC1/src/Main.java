import java.util.Arrays;
import java.util.Scanner;


public class Main {
//CEMC 1
	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		
		int[] l1 = new int[26];
		int[] l2 = new int[26];
		
		String[] w1 = word1.split("");
		String[] w2 = word2.split("");
		Arrays.sort(w1);
		Arrays.sort(w2);
		//System.out.println(Arrays.deepToString(w1));
		//System.out.println(Arrays.deepToString(w2));
		int counter = 0;
		int star = 0;
		for (int i = 1; i<w1.length;i++){
			l1[(int)w1[i].toCharArray()[0]-97] ++;
			if (w2[i].equals("*")){
				star += 1;
			}
			else{
				l2[(int)w2[i].toCharArray()[0]-97] ++;
			}
		}
		//System.out.println(l1[1]);
		//System.out.println(l2[1]);

		//System.out.println(Arrays.toString(l1));
		//System.out.println(Arrays.toString(l2));
		for (int i = 0; i<l1.length;i++){
			if( l1[i] - l2[i] < 0){
				System.out.println("N");
				System.exit(0);
			}
			else{
				counter += l1[i] - l2[i];
				//System.out.print(" " + (l1[i] - l2[i])+" ");
			}
			
		}
		//System.out.println("\nCounter = " + counter + "\nWildcards = " + star );
		if (counter > star){
			System.out.println("N");
		}
		else{
			System.out.println("A");
		}
	}
	

}
