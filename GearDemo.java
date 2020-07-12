package learnDesign;

class Gear{
	private int chainring;
	private int cog;
	private static class Wheel{
		double rim;
		double tire;
		Wheel(double rim, double tire){
			this.rim = rim;
			this.tire = tire;
		}
	}
	private Wheel wheel;
	public Gear(int chainring, int cog, double rim, double tire){
		this.chainring = chainring;
		this.cog = cog;
		this.wheel = new Wheel(rim, tire);
	}
	public double ratio() {
		return (double) chainring / cog;
	}
	public double gearInches(){
		return ratio() * (wheel.rim + 2*wheel.tire);
	}
}

public class GearDemo{
	public static void main(String[] args){
		System.out.println("Started...");
		System.out.println(new Gear(52, 11, 26, 1.5).gearInches());
		System.out.println(new Gear(52, 11, 24, 1.25).gearInches());
	}
}