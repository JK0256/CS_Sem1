import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass();
		System.out.println("Give me a a word");
		String word = sc.nextLine();
		for(int loop1 = 0; loop1 < word.length(); loop1++) {
			System.out.println(word.substring(loop1, loop1 + 1));
		}
	}
}
