import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass();
		System.out.println("Type something");
		String input = sc.nextLine();
		int loop1 = input.length() - 1;
		int loop2;
		int loop3;
		for (loop3 = input.length() - 1; loop3 > 0; loop3--){
			for(loop2 = loop1 - 1; loop2 > 0; loop2--) {
				loop1 = loop2 + 1;
				int bob = input.substring(loop2, loop1).compareTo(" ");
				if (bob == 0) {
					System.out.print(input.substring(loop1) + " ");
				}
			}	
		}
	}
}
