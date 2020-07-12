package learnDesign;

import java.util.HashMap;

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
	public Gear(HashMap<String, Object> args){
		this.chainring = (int) args.getOrDefault("chainring", 0);
		this.cog = (int) args.getOrDefault("cog", 0);
		this.wheel = (Wheel) args.getOrDefault("wheel", new Wheel(0, 0));
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
		System.out.println(new Gear(
			new HashMap<String, Object> (){
				{
					put("cog", 11); 
					put("chainring", 52); 
					// put("wheel", new Wheel(26, 1.5));
				}
			}
		).gearInches());
	}
}
