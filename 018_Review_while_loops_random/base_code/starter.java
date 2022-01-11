import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int secretnum = rand.nextInt(1001)+1;
			System.out.println("Guess a number between 1 and 1000.");
			int guess1 = sc.nextInt();
			if (secretnum == guess1)
			{
				System.out.print("You got the right number! The answer was " + secretnum + ".");
				break;
			}
				else
				{
					System.out.println("Wrong. The answer was " + secretnum + ".");
					System.out.println("Guess a number between 1 and 1000.");
				}
		}
	}
}
