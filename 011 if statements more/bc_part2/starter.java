import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number. ");
		int Bob = sc.nextInt();
		System.out.print("Enter a number. ");
		int Joey = sc.nextInt();
		System.out.print("Enter a number. ");
		int Tom = sc.nextInt();
		if((Bob>Joey) && (Bob>Tom))		{
			System.out.println(Bob + " is the largest value.");
		}
		if((Joey>Bob) && (Joey>Tom))	{
			System.out.println(Joey + " is the largest value.");
		}
		if((Tom>Joey) && (Tom>Joey))		{
			System.out.println(Tom + " is the largest value.");
		}
		if((Bob<Joey) && (Bob<Tom))		{
			System.out.print(Bob + " is the smallest value.");
		}
		if((Joey<Bob) && (Joey<Tom))		{
			System.out.print(Joey + " is the smallest value.");
		}
		if((Tom<Joey) && (Tom<Joey))		{
			System.out.print(Tom + " is the smallest value.");
		}
	}
}
