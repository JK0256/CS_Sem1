import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		myCharacter hero = new myCharacter();
		System.out.println("Please input your Role: Wizard, Warrior, or Rogue.");
		String Role = sc.nextLine();
		hero.setRole(Role);
		System.out.println("Strength - Buff and able to carry larger items. Please input your desired number of Strength points.");
		int Strength = sc.nextInt();
		hero.setStrength(Strength);
		System.out.println("Dexterity - Agile and moves quick. Please input your desired number of Dexterity points.");
		int Dexterity = sc.nextInt();
		hero.setDexterity(Dexterity);
		System.out.println("Intelligence - Better at magic spells. Please input your desired number of Intelligence points.");
		int Intelligence = sc.nextInt();
		hero.setIntelligence(Intelligence);
		System.out.println("Constitution - More health. Please input your desired number of Constitution points.");
		int Constitution = sc.nextInt();
		hero.setConstitution(Constitution);
		System.out.println("Charisma - More likelihood of persuasion. Please input your desired number of Charisma points.");
		int Charisma = sc.nextInt();
		hero.setCharisma(Charisma);
		hero.setAll(Role, Strength, Dexterity, Intelligence, Constitution, Charisma);
	}
}
