import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = sc.nextLine();
		System.out.println("How many times would you like it repeated on the screen?");
		int c = 0;
		while(true)
		{
		System.out.println(c);
			if(c == 10)
			{
				break;
			}
			c = c + 1;
		} 
	}
}
