import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			long n = sc.nextLong();
			long sqrt = (long) Math.ceil(Math.sqrt(n/2));
			System.out.println(n);
			for(long i = sqrt; i<n;i++){
				long j = (long) Math.sqrt(n-i*i);
				//System.out.println(i+" "+j);
				if (j*j+i*i==n){
					System.out.println(i+" "+j);
				}
				
			}
		
		
		}
		
	}

}
