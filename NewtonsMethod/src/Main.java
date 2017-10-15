import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1 = Double.parseDouble(in.nextLine());
		int counter = 1;
		boolean cont = true;
		while(cont){
			in.nextLine();
			System.out.println("x"+ counter++ + " :: " + x1 +"  -  " + f(x1) + "  /  "+fprime(x1));
			x1 = x1 - f(x1) / fprime(x1);
			
		}

	}
	
	public static double f(double x){
		//return (Math.log(x)-1/(x-3));
		return (Math.cos(x) - x*Math.sin(x));
	}
	public static double fprime(double x){
		//return (1/x+1/(Math.pow((x-3), 2)));
		return (-x*Math.cos(x) - 2*Math.sin(x));
	}
	
}
