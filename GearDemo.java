package learnDesign;

public class GearDemo{
	public static void main(String[] args){
		System.out.println("Started...");
		int chainring = 52;
		int cog = 11;
		double ratio = (double) chainring / cog;
		System.out.println(ratio);

		chainring = 30;
		cog = 27;
		ratio = (double) chainring / cog;
		System.out.println(ratio);
	}
}