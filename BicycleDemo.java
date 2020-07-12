package learnDesign;
import java.util.Arrays;
import java.util.HashMap;


class Bicycle{
	public String style;
	public String frontShock;
	public String rearShock;

	public String size;
	public String tapeColor;

	private String chain;
	private String tireSize;

	public Bicycle(String size, String tapeColor, String style, String frontShock, String rearShock){
		this.size = size;
		this.tapeColor = tapeColor;
		this.style = style;
		this.frontShock = frontShock;
		this.rearShock = rearShock;
	}

	public HashMap<String, String> getSpares(){
		HashMap<String, String> newMap = new HashMap<> ();
		if("road".equals(style)){
			newMap.put("chain", "10-speed");
			newMap.put("tireSize", "23");
			newMap.put("tapeColor", tapeColor);
		}else{
			newMap.put("chain", "10-speed");
			newMap.put("tireSize", "2.1");
			newMap.put("rearShock", rearShock);
		}
		return newMap;
	}
}

public class BicycleDemo{
	public static void main(String[] args){
		Bicycle bike = new Bicycle("S", null, "mountain", "Manitou", "Fox");
		System.out.println(bike.size);
		System.out.println(bike.getSpares());
	}
}