package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	Random rand = new Random();
	int loop1 = 0;
	public void toStringArray (int [] y) {
		loop1 = 0;
		while(loop1 < y.length) {
			System.out.print(loop1 + ": ");
			System.out.println(y[loop1] + "	");
			loop1++;
		}
	}
	
	public static int getArrayAverage (int [] y) {
		int loop1 = 0;
		int average;
		int total = 0;
			while(loop1 < y.length) {
				total = y[loop1] + total;
				loop1++;
			}
		average = total / y.length;
		return average;
	}
	public static int getArrayMax (int [] y) {
		int loop1 = 0;
		int max = 0;
			while(loop1 < y.length) {
				if(y[loop1] > max) {
					max = y[loop1];
				}
				loop1++;
			}
		return max;
	}
	public static int getArrayMin (int [] y) {
		int loop1 = 0;
		int min = 1000;
			while(loop1 < y.length) {
				if(y[loop1] < min) {
					min = y[loop1];
				}
				loop1++;
			}
		return min;
	}
}
