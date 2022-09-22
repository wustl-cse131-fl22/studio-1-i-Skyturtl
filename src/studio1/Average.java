package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.print("The first of two integers you want to be averaged:");
		int n1 = in.nextInt();
		System.out.print("The second of two integers you want to be averaged:");
		int n2 = in.nextInt();
		double average = (n1+n2)/(double)2;
		System.out.println("The average of " + n1 + " and " + n2 + " is " + average + ".");
		
		
	}

}
