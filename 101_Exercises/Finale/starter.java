import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		public static int getMode (int [] x) {
			int dupe;
			int dupenum = 0;
			int loop = 0;
			int loop1 = 0;
			topdupe = 0;
			for (loop = 0; loop < x.length; loop++) {
				for(loop1 = 0; loop1 < x.length; loop1++) {
					dupe = x[loop1];
					if (dupe == x[loop1]) {
						System.out.println();
						dupenum++;
					}
				}
				if (dupenum > topdupe) {
					topdupe = dupe;
				}
			}
		}
	}
}
