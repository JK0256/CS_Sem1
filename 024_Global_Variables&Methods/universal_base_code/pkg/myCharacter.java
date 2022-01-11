package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	String role;
	int Strength;
	int Dexterity;
	int Intelligence;
	int Constitution;
	int Charisma;
	
	public myCharacter(String a) {
		Scanner sc = new Scanner(System.in);
		String role = a;
		String Wizard = new String("Wizard");
		String Warrior = new String("Warrior");
		String Rogue = new String("Rogue");
		while (!((role.equals("Wizard")) || (role.equals("Warrior")) || (role.equals(("Rogue"))))){
				System.out.println(role + " is not one of the choices. Please try again.");
				System.out.println("Do you want to be a Wizard, Warrior, or Rogue?");
				String role2 = sc.nextLine();
				role = role2;
			}
	}
	public void myToString(){
	Strength = 5;
	Dexterity = 5;
	Intelligence = 5;
	Constitution = 5;
	Charisma = 5;
	System.out.print("Warrior class has " + Strength + " Strength, " + Dexterity + " Dexterity, ");
	System.out.print(Intelligence + " Intelligence" + Constitution + " Constitution, " + Charisma + " Charisma.");
	}
}