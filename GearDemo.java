package learnDesign;

class Gear{
	private int chainring;
	private int cog;
	public Gear(int chainring, int cog){
		this.chainring = chainring;
		this.cog = cog;
	}
	public double ratio() {
		return (double) chainring / cog;
	}
}

public class GearDemo{
	public static void main(String[] args){
		System.out.println("Started...");
		System.out.println(new Gear(52, 11).ratio());
		System.out.println(new Gear(30, 27).ratio());
	}
}