package learnDesign;

import java.util.HashMap;


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

	public double gearInches(double diameter){
		return ratio() * diameter;
	}
}


class Wheel{
	private double rim;
	private double tire;
	private Gear gear;
	public Wheel(double rim, double tire, int chainring, int cog){
		this.rim = rim;
		this.tire = tire;
		this.gear = new Gear(chainring, cog);
	}
	public double diameter(){
		return (rim + 2*tire);
	}
	public double circumference(){
		return diameter() * Math.PI;
	}

	public double gearInches(){
		return gear.gearInches(diameter());
	}

}

public class WheelAndGearDemo{
	public static void main(String[] args){
		System.out.println("Started...");
		System.out.println(new Wheel(26, 1.5, 52, 11).gearInches());
	}
}
