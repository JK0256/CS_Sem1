import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to be a Wizard, Warrior, or Rogue?");
		myCharacter player = new myCharacter(sc.nextLine());
		player.myToString();
	}
}
