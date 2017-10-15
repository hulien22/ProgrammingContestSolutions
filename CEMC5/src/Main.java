import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long g = in.nextLong();
		//int[] nums = new int[n];
		in.nextLine();
		//String num = in.nextLine();
		String temp = in.nextLine();
		
		for (int gen = 0; gen<g;gen++){
			String num = temp;
			temp = "";
			//System.out.println(num);
			//First num
			if (num.substring(1,2).equals("1") ^ num.substring(n-1,n).equals("1")){
				temp+="1";
			}
			else{
				temp+="0";
			}
			for (int i = 1;i<n-1;i++){
				if (num.substring(i-1,i).equals("1") ^ num.substring(i+1,i+2).equals("1")){
					temp+="1";
				}
				else{
					temp+="0";
				}
			}
			//last num
			if (num.substring(0,1).equals("1") ^ num.substring(n-2,n-1).equals("1")){
				temp+="1";
			}
			else{
				temp+="0";
			}
			
			if (temp.contains("1") == false){
				System.out.println(temp);
				System.exit(0);
			}
			
		}
		
		System.out.println(temp);
		
		/*for (int i =0; i<inn.length();i++){
			nums[i] = Integer.parseInt(inn.substring(i,i+1));
		}
		for (int i = 0;i<g;i++){
			int[] num2 = new int[n];
			for (int j = 0;j<n;j++){
				num2[j] = nums[j];
			}
			for (int j = 0;j < n;j ++){
				if(j==0){
					if (nums[n-1]==1){
						num2[0] =1;
					}
					else if(nums[1]==1){
						num2[0] =1;
					}
					else{
						num2[0]=0;
					}
					if (nums[n-1]==1 && nums[1]==1){
						num2[0]=0;
					}
				}
				else if(j==n-1){
					if (nums[n-2]==1){
						num2[j] =1;
					}
					else if(nums[0]==1){
						num2[j] =1;
					}
					else{
						num2[j]=0;
					}
					if(nums[n-2]==1 && nums[0]==1){
						num2[j]=0;
					}
				}
				else{
					if (nums[j-1] == 1){
						num2[j] =1;
						}
					else if (nums[j+1]==1){
						num2[j] =1;
					}
					else{
						num2[j]=0;
					}
					if(nums[j-1] == 1 && nums[j+1]==1){
						num2[j]=0;
					}
				}
				
				
			}
			
			for (int j = 0;j<n;j++){
				nums[j] = num2[j];
			}
			
		}
		
		for(int i = 0;i<nums.length;i++){
			System.out.print(nums[i]);
		}
		in.close();
	}*/

}}
