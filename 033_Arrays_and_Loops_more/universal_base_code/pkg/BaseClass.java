package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {

	public BaseClass() {
		Random rand = new Random();
		int[] x = new int[rand.nextInt(201)+51];
		int loop1 = 0;
		while(loop1 < x.length) {
			x[loop1] = rand.nextInt(100)+1;
			loop1++;
		}
		loop1 = 0;
		int min = 1000;
			while(loop1 < x.length) {
				if(x[loop1] < min) {
					min = x[loop1];
				}
				loop1++;
			}
		loop1 = 0;
		int max = 0;
			while(loop1 < x.length) {
				if(x[loop1] > max) {
					max = x[loop1];
				}
				loop1++;
			}
		loop1 = 0;
		int average;
		int total = 0;
			while(loop1 < x.length) {
				total = x[loop1] + total;
				loop1++;
			}
		average = total / x.length;
		System.out.println("Out of " + x.length + " random numbers from 1-100:");
		System.out.println("Minimum is " + min + ".");
		System.out.println("Maximum is " + max + ".");
		System.out.println("Average is " + average + ".");
	}
}
