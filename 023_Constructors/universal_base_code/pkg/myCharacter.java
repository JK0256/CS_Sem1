package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
	String role;
	public myCharacter() {
		role = "No role";
		System.out.println("Empty: " + role);
	}
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
		System.out.println("What's your name?");
		String name = sc.nextLine();	
		System.out.println("You're a " + role + ", " + name + "!");
	}
}

