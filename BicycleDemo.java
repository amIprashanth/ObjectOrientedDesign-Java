package learnDesign;
import java.util.Arrays;
import java.util.HashMap;

class Bicycle{
	public String size;
	public String tapeColor;

	public Bicycle(String size, String tapeColor){
		this.size = size;
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

public class BicycleDemo{
	public static void main(String[] args){
		Bicycle bike = new Bicycle("M", "red");
		System.out.println(bike.size);
		System.out.println(bike.getSpares());
	}
}