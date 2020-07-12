package learnDesign;

class Gear{
	private int chainring;
	private int cog;
	private double rim;
	private double tire;
	public Gear(int chainring, int cog, double rim, double tire){
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}
	public double ratio() {
		return (double) chainring / cog;
	}
	public double gearInches(){
		return ratio() * (rim + 2*tire);
	}
}

public class GearDemo{
	public static void main(String[] args){
		System.out.println("Started...");
		System.out.println(new Gear(52, 11, 26, 1.5).gearInches());
		System.out.println(new Gear(52, 11, 24, 1.25).gearInches());
	}
}