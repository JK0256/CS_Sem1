import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int RNG1 = rand.nextInt(1001)+1;
		System.out.println("Guess a number between 1 and 1000.");
		int guess = sc.nextInt();
		if (RNG1 == guess)
		{
			System.out.print("Congratulations! You guessed correctly!");
		}
		else if (RNG1 > guess)
		{
			System.out.print("Guess higher.");
		}
		else if (RNG1 < guess)
		{
			System.out.print("Guess lower.");
		}
	}
}
