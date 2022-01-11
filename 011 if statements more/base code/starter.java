import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number. ");
		int Bob = sc.nextInt();
		System.out.print("Enter a number. ");
		int Joey = sc.nextInt();
		if (Bob == Joey)
		{
			System.out.print("Values are equal.");
		}
		if (Bob != Joey)
		{
			System.out.print("Values are not equal.");
		}
	}
}
