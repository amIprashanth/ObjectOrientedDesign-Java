package learnDesign;

import java.util.Arrays;

class Gear{
	private double[][] data;
	public Gear(double[][] data){
		this.data = data;
	}
	public double[] getDiameters(){
		double[] diams = new double[data.length];
		for(int i=0; i<data.length ;i++){
			diams[i] = data[i][0] + data[i][1]*2;
		}
		return diams;
	}
}

public class ObscuringReferences{
	public static void main(String[] args){
		System.out.println("Started...");
		double[][] inputData = {{622, 20}, {622, 23}, {559, 30}, {559, 40}};
		System.out.println(Arrays.toString(new Gear(inputData).getDiameters()));
	}
}