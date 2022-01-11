package pkg;
import java.util.Scanner;
import java.util.Random;


public class Hangman{
	private int checkNum;
	private String guessingWord;	//The word trying to be guessed
	private int numTries;			//How many tries the user has
	
	//Empty Constructor
	public Default() {
		guessingWord = String generateWord();
		numTries = 5;
	}
	//Integer Constructor
	public CreateHangman(int inputTries) {
		guessingWord = String generateWord();
		numTries = inputTries;
	}
	public void generateWord(){
		/* implementation not shown */
	}
	/** Returns the index of the FIRST same letter in the guessedWord
	 *  @param letter a letter guessed by the user
	 *  @param start, the starting of index of where in the word to start checking
	 *		Preconditions: Assume letter is one single character and lowercase.
	 *	 			Assume start >= 0
	 *  @return index of first same occurrence of letter, returns -1 if no occurrence found.
	 */
	public int guessCheck(String letter, int start){
		for (int count = start; count < guessingWord.length; count++) {
			int check = word.substring(loop1, loop1 + 1).compareTo(letter);
			if (check == 0) {
				checkNum++;
				return count;
			}
			else {
				return -1;
			}
		}
	}
	
	/** Returns true if all booleans in the array are true, false otherwise.
	 *  The purpose of this is to check if all letters have been guessed.
	 *	@param boolean array will have true or false values of guessed letters.
	 *		Precondition: arr.length > 0
	 *  @return true if all values are true, false if one or more are false.
	 */
	public boolean checkWin(boolean [] arr){
		if (checkNum == guessingWord.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
}

