import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass();
		System.out.println("Tell me your pet peeve");
		String petpeeve = sc.nextLine();
		System.out.print("Your pet peeve is \"" + petpeeve + "\"? Same here man.");
	}
}
