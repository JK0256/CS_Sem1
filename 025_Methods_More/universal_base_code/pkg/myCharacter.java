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
	
	public String setRole(String a) {
		Scanner sc = new Scanner(System.in);
		String role = a;
		String Wizard = new String("Wizard");
		String Warrior = new String("Warrior");
		String Rogue = new String("Rogue");
		while (!((role.equals("Wizard")) || (role.equals("Warrior")) || (role.equals(("Rogue"))))){
				System.out.println(role + " is not one of the choices. Please be precise and try again.");
				System.out.println("Do you want to be a Wizard, Warrior, or Rogue?");
				String role2 = sc.nextLine();
				role = role2;
			}
		return role;
	}
	int Statpoints = 25;
	
	public int setStrength(int a){
		int Strength = a;
		return Strength;
	}
	public int setDexterity(int a){
		int Dexterity = a;
		return Dexterity;
	}
	public int setIntelligence(int a){
		int Intelligence = a;
		return Intelligence;
	}
	public int setConstitution(int a){
		int Constitution = a;
		return Constitution;
	}
	public int setCharisma(int a){
		int Charisma = a;
		return Charisma;
	}
	public boolean setAll(String a, int b, int c, int d, int e, int f){	
		return true;
	}
}