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
		System.out.println("What title would you like people to address you with?");
		String title = sc.nextLine();
		if (Wizard.equals(role))
		{
			System.out.println("You're a Wizard, " + title + " " + name + "!");
		}
		else if (Warrior.equals(role))
		{
			System.out.println("You're a Warrior, " + title + " " + name + "!");
		}
		else if (Rogue.equals(role))
		{
			System.out.println("You're a Rogue, " + title + " " + name + "!");
		}
		System.out.println("Now choose your stats. Strength, Dexterity, Intelligence, Constitution, and Charisma.");
		System.out.println("You'll have 25 assignable stat points, and maximum of 10 points for every stat.");
		int Statpoints = 25;
		System.out.print("Strength - Buff and able to carry larger items. ");
		int Strength1 = sc.nextInt();
		if (Strength1 <= 10)
		{
			Statpoints =  Statpoints - Strength1;
			System.out.println(Statpoints + " statpoints left.");
		}
		else
		{
			System.out.println("That is more than 10 points. Please try again.");
			int Strength2 = sc.nextInt();
			if (Strength2 <= 10)
			{
				Statpoints =  Statpoints - Strength2;
				System.out.println(Statpoints + " statpoints left.");
			}
			else
			{
				System.out.println("This is your second time, you may not input a value more than 10. Please start over.");
			}
		}
		System.out.print("Dexterity - Agile and moves quick. ");
		int Dexterity1 = sc.nextInt();
		if (Dexterity1 <= 10)
		{
			Statpoints =  Statpoints - Dexterity1;
			System.out.println(Statpoints + " statpoints left.");
		}
		else
		{
			System.out.println("That is more than 10 points. Please try again.");
			int Dexterity2 = sc.nextInt();
			if (Dexterity2 <= 10)
			{
				Statpoints =  Statpoints - Dexterity2;
				System.out.println(Statpoints + " statpoints left.");
			}
			else
			{
				System.out.println("This is your second time, you may not input a value more than 10. Please start over.");
			}
		}
		System.out.print("Intelligence - Better at magic spells. ");
		int Intelligence1 = sc.nextInt();
		if (Intelligence1 <= 10)
		{
			Statpoints =  Statpoints - Intelligence1;
			System.out.println(Statpoints + " statpoints left.");
		}
		else
		{
			System.out.println("That is more than 10 points. Please try again.");
			int Intelligence2 = sc.nextInt();
			if (Intelligence2 <= 10)
			{
				Statpoints =  Statpoints - Intelligence2;
				System.out.println(Statpoints + " statpoints left.");
			}
			else
			{
				System.out.println("This is your second time, you may not input a value more than 10. Please start over.");
			}
		}
		if (Statpoints <= 0)
		{
			System.out.println("You've used up all of your statpoints.");
		}
		else
		{
		System.out.print("Constitution - More health. ");
		int Constitution1 = sc.nextInt();
		if (Constitution1 <= 10)
		{
			Statpoints =  Statpoints - Constitution1;
			System.out.println(Statpoints + " statpoints left.");
		}
		else
		{
			System.out.println("That is more than 10 points. Please try again.");
			int Constitution2 = sc.nextInt();
			if (Constitution2 <= 10)
			{
				Statpoints =  Statpoints - Constitution2;
				System.out.println(Statpoints + " statpoints left.");
			}
			else
			{
				System.out.println("This is your second time, you may not input a value more than 10. Please start over.");
			}
		}
		if (Statpoints <= 0)
		{
			System.out.println("You've used up all of your statpoints.");
		}
		else
		{
		System.out.print("Charisma - More likelihood of persuasion. ");
		int Charisma1 = sc.nextInt();
		if (Charisma1 <= 10)
		{
			Statpoints =  Statpoints - Charisma1;
			System.out.println(Statpoints + " statpoints left.");
		}
		else
		{
			System.out.println("That is more than 10 points. Please try again.");
			int Charisma2 = sc.nextInt();
			if (Charisma2 <= 10)
			{
				Statpoints =  Statpoints - Charisma2;
				System.out.println(Statpoints + " statpoints left.");
			}
			else
			{
				System.out.println("This is your second time, you may not input a value more than 10. Please start over.");
			}
		if (Statpoints <= 0)
		{
			System.out.println("You've used up all of your statpoints.");
		}
		}
		}
		}
	}
}
