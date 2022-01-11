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
		int loop1 = 0;
		while(loop1 < word.length()) {
			System.out.println(word.substring(loop1, loop1 + 1));
			loop1++;
		}
	}
}
