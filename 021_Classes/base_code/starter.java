import java.util.Scanner;
import java.util.Random;

class character{
		String role;
		
		public character(){
			role = "Warrior";
		}
	
		public static void stats(){
		int Strength = 5;
		int Dexterity = 5;
		int Intelligence = 5;
		int Constitution = 5;
		int Charisma = 5;
		System.out.print("Warrior class has " + Strength + " Strength, " + Dexterity + " Dexterity, ");
		System.out.print(Intelligence + " Intelligence" + Constitution + " Constitution, " + Charisma + " Charisma.");
	}
}

class starter {
	public static void main(String args[]) {
		character warrior = new character();
		warrior.stats();
	}
}
