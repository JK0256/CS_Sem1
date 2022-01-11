import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your first name? ");
		String name = sc.nextLine();
		System.out.println("Name is " + name+".");
		System.out.print("What is your age? ");
		int age = sc.nextInt();
		System.out.println("Age is " + age+".");
		System.out.println("What was the month of your birth? ");
		int birthmonth = sc.nextInt();
		System.out.println("Birth month is " + birthmonth+".");
		System.out.println("What was the day of your birth? ");
		int birthday = sc.nextInt();
		System.out.println("Birth day is " + birthday+".");
		System.out.println("What was the year of your birth? ");
		int birthyear = sc.nextInt();
		System.out.println("Birth year is " + birthyear+".");
		System.out.println("How much is a buck fifty? ");
		double buckfifty = sc.nextDouble();
		System.out.println("A buck fifty is " + buckfifty+".");
	}
}
