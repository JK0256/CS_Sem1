import java.util.Scanner;
import java.util.Random;

class starter {
	public static void power(int x, int y)
	{
		System.out.println(Math.pow(x, y));
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a whole number.");
		int x = sc.nextInt();
		System.out.println("Input a whole number.");
		int y = sc.nextInt();
		power(x, y);
	}
}
