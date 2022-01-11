package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {

	public BaseClass() {
	int[] bob = new int[10];
	bob[0] = 9;
	bob[1] = 8;
	bob[2] = 7;
	bob[3] = 6;
	bob[4] = 5;
	bob[5] = 4;
	bob[6] = 3;
	bob[7] = 2;
	bob[8] = 1;
	bob[9] = 0;
	
	int loop1;
	for(loop1 = 0; loop1 < bob.length; loop1++) {
		System.out.println(bob[loop1]);
		}	
	}

}

