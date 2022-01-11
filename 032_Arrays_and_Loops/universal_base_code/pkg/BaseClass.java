package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	
	public BaseClass() {
		Random rand = new Random();
		//ARRAY
		int[] x = new int[1000];
		int loop1=0;
		while(loop1 < x.length) {
			x[loop1] = rand.nextInt(10000);
			loop1++;
		}
		//PRINT
		loop1 = 0;
		while(loop1 < x.length) {
			System.out.print(loop1 + ": ");
			System.out.println(x[loop1] + "	");
			loop1++;
		}
	}
}
