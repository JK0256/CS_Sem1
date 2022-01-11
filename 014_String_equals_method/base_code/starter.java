import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String Wizard = new String("Wizard");
		String Warrior = new String("Warrior");
		String Rogue = new String("Rogue");
		System.out.println("Do you want to be a Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
		if (!((role.equals("Wizard")) || (role.equals("Warrior")) || (role.equals(("Rogue")))))
		{
			System.out.println(role + " is not one of the choices. Please start over.");
		}
		else
		{
			System.out.println(role + " was chosen.");
		}
		System.out.println("What's your name? ");
		String name = sc.nextLine();
		if (Wizard.equals(role))
		{
			System.out.println("You're a Wizard, " + name + "!");
		}
		else if (Warrior.equals(role))
		{
			System.out.println("You're a Warrior, " + name + "!");
		}
		else if (Rogue.equals(role))
		{
			System.out.println("You're a Rogue, " + name + "!");
		}
	}
}
