import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNextLine()) {
			int size = Integer.parseInt(input.nextLine());
			int[] nums = new int[size];
			for (int i = 0; i<size;i++){
				nums[i] = Integer.parseInt(input.nextLine());
			}
			Arrays.sort(nums);
			int lf = 0;
			int sf = 0;
			ArrayList<Integer> l = new ArrayList<Integer>();
			ArrayList<Integer> s = new ArrayList<Integer>();
			int c = 1;
			for (int i = 0; i< nums.length;i++){

				
			
				if (i!=0){
					if (nums[i] != nums[i-1]){
						if (c>lf){
							s = new ArrayList<Integer>(l);
							sf = lf;
							lf = c;
							l.clear();
							l.add(nums[i-1]);
						}
						else if(c==lf){
							l.add(nums[i-1]);
						}
						else if (c>sf){
							sf = c;
							s.clear();
							s.add(nums[i-1]);
						}
						else if (c == sf){
							s.add(nums[i-1]);
						}
						if (i<= nums.length){
							c = 1;
						}
						
					}
					else{
						c++;
					}
				}
				/*System.out.println(nums[i]+ "  " +c);
				System.out.println(l);
				System.out.println(s);*/
			}
			if (c>lf){
				s = new ArrayList<Integer>(l);
				sf = lf;
				lf = c;
				l.clear();
				l.add(nums[size-1]);
			}
			else if(c==lf){
				l.add(nums[size-1]);
			}
			else if (c>sf){
				sf = c;
				s.clear();
				s.add(nums[size-1]);
			}
			else if (c == sf){
				s.add(nums[size-1]);
			}
			/*System.out.println(l +  "   " + s);
			System.out.println(lf +  "   " + sf);*/
			if (l.size()>1){
				System.out.println(l.get(l.size()-1) - l.get(0));
			}
			else{
				int dif = 0;
				for (int i:s){
					if(Math.abs(l.get(0) - i) > dif){
						dif = Math.abs(l.get(0) - i);
					}
				}
				System.out.println(dif);
			}
			
		}
	}

}
