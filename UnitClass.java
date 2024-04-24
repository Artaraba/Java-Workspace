package unit;

public class Unit {
	
	private String unitType = "";
	private double hitPoints = 0;
	private double attack = 0;
	private double defense = 0;

	Unit(String unitType){
		if (unitType == "Worker") {
			System.out.println("It works");
		} else {
			System.out.println("Beat em up");
		}
	}
}
