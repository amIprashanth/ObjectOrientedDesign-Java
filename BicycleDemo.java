package learnDesign;
import java.util.Arrays;
import java.util.HashMap;


abstract class Bicycle{
	protected String size;
	protected String chain;
	protected String tireSize;

	public Bicycle(String size, String chain, String tireSize){
		this.size = size;
		this.chain = chain;
		this.tireSize = tireSize;
	}

	public String defaultChain(){
		if(chain!=null) return chain;
		return "10-speed";
	}

	abstract public String defaultTireSize();

	public HashMap<String, String> getSpares(){
		HashMap<String, String> newMap = new HashMap<> ();
		newMap.put("chain", defaultChain());
		newMap.put("tireSize", defaultTireSize());
		return newMap;
	}

	// declare methods
}

class RoadBike extends Bicycle{
	public String tapeColor;

	public RoadBike(String size, String chain, String tireSize, String tapeColor){
		super(size, chain, tireSize);
		this.tapeColor = tapeColor;
	}

	public HashMap<String, String> getSpares(){
		HashMap<String, String> newMap = super.getSpares();
		newMap.put("tapeColor", tapeColor);
		return newMap;
	}

	public String defaultTireSize(){
		if(tireSize!=null) return tireSize;
		return "23";
	}
}

class MountainBike extends Bicycle{
	private String frontShock;
	private String rearShock;

	public MountainBike(String size, String chain, String tireSize, String frontShock, String rearShock){
		super(size, chain, tireSize);
		this.frontShock = frontShock;
		this.rearShock = rearShock;
	}
	
	public HashMap<String, String> getSpares(){
		HashMap<String, String> newMap = super.getSpares();
		newMap.put("rearShock", rearShock);		
		return newMap;
	}

	public String defaultTireSize(){
		if(tireSize!=null) return tireSize;
		return "2.1";
	}

}

public class BicycleDemo{
	public static void main(String[] args){
		RoadBike bike = new RoadBike("M", "30-speed", "100", "red");
		System.out.println(bike.size);
		System.out.println(bike.getSpares());

		MountainBike bike1 = new MountainBike("S", null, null, "Manitou", "Fox");
		System.out.println(bike1.size);
		System.out.println(bike1.getSpares());
	}
}