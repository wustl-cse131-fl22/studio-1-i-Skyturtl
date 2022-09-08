package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean xEqualsY = x==y;
		boolean yEqualsZ = y==z;
		boolean exception = xEqualsY==!yEqualsZ;
		boolean xMoreY = x>y;
		boolean yMoreZ = y>z;
		boolean inc = !(exception)==(xMoreY==yMoreZ);
//		
//		boolean isOrdered = (x>y && y>z) || (z>y && y>x);
		System.out.println(inc);
	}

}
