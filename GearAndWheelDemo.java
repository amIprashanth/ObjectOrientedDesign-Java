package learnDesign;

class Wheel{
	private double rim;
	private double tire;
	public Wheel(double rim, double tire){
		this.rim = rim;
		this.tire = tire;
	}
	public double diameter(){
		return (rim + 2*tire);
	}
	public double circumference(){
		return diameter() * Math.PI;
	}
}

class Gear{
	private int chainring;
	private int cog;
	private Wheel wheel;
	public Gear(int chainring, int cog, Wheel wheel){
		this.chainring = chainring;
		this.cog = cog;
		this.wheel = wheel;
	}

	public double ratio() {
		return (double) chainring / cog;
	}

	public double gearInches(){
		return ratio() * wheel.diameter();
	}
}

public class GearAndWheelDemo{
	public static void main(String[] args){
		System.out.println("Started...");
		System.out.println(new Gear(52, 11, new Wheel(26, 1.5)).gearInches());
	}
}