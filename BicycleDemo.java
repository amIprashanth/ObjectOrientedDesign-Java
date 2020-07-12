package learnDesign;
import java.util.Arrays;
import java.util.HashMap;


class Bicycle{
	public String size;

	public Bicycle(String size){
		this.size = size;
	}
}

class RoadBike extends Bicycle{
	public String tapeColor;

	public RoadBike(String size, String tapeColor){
		super(size);
		this.tapeColor = tapeColor;
	}

	public HashMap<String, String> getSpares(){
		HashMap<String, String> newMap = new HashMap<> ();
		newMap.put("chain", "10-speed");
		newMap.put("tireSize", "23");
		newMap.put("tapeColor", tapeColor);
		return newMap;
	}
}

class MountainBike extends Bicycle{
	private String frontShock;
	private String rearShock;
	public MountainBike(String size, String tapeColor, String frontShock, String rearShock){
		super(size);
		this.frontShock = frontShock;
		this.rearShock = rearShock;
	}
	
	public HashMap<String, String> getSpares(){
		HashMap<String, String> newMap = super.getSpares();
		newMap.put("rearShock", rearShock);
		return newMap;
	}

}

public class BicycleDemo{
	public static void main(String[] args){
		MountainBike bike = new MountainBike("S", null, "Manitou", "Fox");
		System.out.println(bike.size);
		System.out.println(bike.getSpares());
	}
}