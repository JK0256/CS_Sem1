import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		Ascii defaults = new Ascii();
		defaults.printArt();
		
		Ascii dog = new Ascii("Dog");
		dog.printArt();
		
		Ascii cactus = new Ascii("Cactus", "Bob");
		cactus.printArt();
		
		Ascii other = new Ascii("Other", 2);
		other.printArt();
		
		Ascii smile = new Ascii("Smile");
		Ascii smile1 = new Ascii();
		System.out.println("Type?");
		String type = sc.nextLine();
		smile1.setType(type);
		System.out.println("Name?");
		String name = sc.nextLine();
		smile1.setName(name);
		System.out.println("Number?");
		int number = sc.nextInt();
		smile1.setNumber(number);
		smile.printArt();
	}
}
