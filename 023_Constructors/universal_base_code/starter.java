import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		myCharacter empty = new myCharacter();
		System.out.println("Do you want to be a Wizard, Warrior, or Rogue?");
		myCharacter defined = new myCharacter(sc.nextLine());
	}
}
