package learnDesign;

import java.util.Arrays;

class Gear{
	// @Struct
	public static class Wheel{
		double rim;
		double tire;
		Wheel(double rim, double tire){
			this.rim = rim;
			this.tire = tire;
		}
	}

	private Wheel[] wheels;
	public Gear(double[][] inputData){
		this.wheels = wheelify(inputData);
	}

	private Wheel[] wheelify(double[][] inputData){
		Wheel[] myWheels = new Wheel[inputData.length];
		for(int i=0; i<inputData.length; i++){
			myWheels[i] = new Wheel(inputData[i][0], inputData[i][1]);
		}
		return myWheels;
	}

	public double[] getDiameters(){
		double[] diams = new double[wheels.length];
		for(int i=0; i<wheels.length ;i++){
			diams[i] = diameter(wheels[i]);
		}
		return diams;
	}

	private double diameter(Wheel wheel){
		return wheel.rim + (wheel.tire)*2;
	}
}

public class RevealingReferences{
	public static void main(String[] args){
		System.out.println("Started...");
		double[][] inputData = {{622, 20}, {622, 23}, {559, 30}, {559, 40}};
		System.out.println(Arrays.toString(new Gear(inputData).getDiameters()));
	}
}