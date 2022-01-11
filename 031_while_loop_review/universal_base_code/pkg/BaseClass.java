package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {

	public BaseClass() {
		Random rand = new Random();
		int loop1 = 0;
		while(loop1 < 100) {
			System.out.println(rand.nextInt(100)+1);
			loop1++;
		}
		
	}

}

