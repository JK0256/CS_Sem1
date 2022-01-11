import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int RNG1 = rand.nextInt(10);
	int RNG2 = rand.nextInt(101)+1;
	double RNG3 = rand.nextDouble()+2.5;
	int RNG4 = rand.nextInt(576)+14;
	System.out.println(RNG1);
	System.out.println(RNG2);
	System.out.println(RNG3);
	System.out.println(RNG4);
	}
}
