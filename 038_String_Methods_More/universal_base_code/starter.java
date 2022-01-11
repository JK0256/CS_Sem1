import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass();
		System.out.println("Give me a name (first and last)");
		String word = sc.nextLine();
		for(int loop1 = 0; loop1 < word.length(); loop1++) {
			int bob = word.substring(loop1, loop1 + 1).compareTo(" ");
			if (bob == 0) {
				System.out.println(word.substring(loop1 + 1));
			}
		}
	}
}
