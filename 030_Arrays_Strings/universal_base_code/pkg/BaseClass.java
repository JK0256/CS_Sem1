package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {

	public BaseClass() {
	String[] bob = new String[10];
	bob[0] = "We're no strangers to love";
	bob[1] = "You know the rules and so do I";
	bob[2] = "A full commitment's what I'm thinking of";
	bob[3] = "You wouldn't get this from any other guy";
	bob[4] = "I just wanna tell you how I'm feeling";
	bob[5] = "Gotta make you understand";
	bob[6] = "Never gonna give you up";
	bob[7] = "Never gonna let you down";
	bob[8] = "Never gonna run around and desert you";
	bob[9] = "Never gonna make you cry";

	int loop1;
	for(loop1 = 0; loop1 < bob.length; loop1++) {
		System.out.println(bob[loop1]);
		}
	}

}

