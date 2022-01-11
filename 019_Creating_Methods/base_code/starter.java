import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a)
	{
		System.out.println(a);
	}
	public static void toStringCombined(String a, String b)
	{
		System.out.print(a + " " + b);
	}
	public static void main(String args[]) {
		String a1 = new String("Hello");
		String b1 = new String("Bob");
		toString(a1);
		toStringCombined(a1, b1);
	}
}
