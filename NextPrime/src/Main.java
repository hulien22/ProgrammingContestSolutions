import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (isPrime(n)){
			System.out.println(n);
			System.exit(0);
		}
		else if(n%2 == 0)
			n++;
		while(isPrime(n)==false)
			n+=2;
		System.out.println(n);
	}
	public static boolean isPrime(int a){
		if (a==1){
			System.out.println(2);
			System.exit(0);
			return false;
		}
		if(a<4)
			return true;
		if(a==4){
			return false;
		}
		for(int i =3;i<=Math.sqrt(a);i++){
			if(a%i==0)
				return false;
		}
		return true;
	}
}
