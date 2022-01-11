import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = sc.nextLine();
		System.out.println("How many times would you like it repeated on the screen?");
		int num = sc.nextInt();
		int count = 0;
		while(true)
		{
			System.out.println(name);
			if(count == num)
			{
				break;
			}
			count = count + 1;
		}
	}
}
