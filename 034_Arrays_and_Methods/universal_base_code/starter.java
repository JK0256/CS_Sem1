import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Random rand = new Random();
		BaseClass z = new BaseClass();
		int loop1 = 0;
		int[] x = new int[100];
		while(loop1 < x.length) {
			x[loop1] = rand.nextInt(100)+1;
			loop1++;
		}
		z.toStringArray(x);
		z.getArrayAverage(x);
		System.out.println("Average is " + z.getArrayAverage(x));
		z.getArrayMax(x);
		System.out.println("Maximum is " + z.getArrayMax(x));
		z.getArrayMin(x);
		System.out.println("Minimum is " + z.getArrayMin(x));
	}
}
