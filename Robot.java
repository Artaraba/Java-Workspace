package robot;

public class Robot {

	private String unitType = " ", unitName = " ";
	private int hp = 0, attack = 0, defense = 0;
	
	public Robot(String name, String unitType) {
		this.unitName = name;
		this.unitType = unitType;
		hp = 50;
		attack = 1;
		defense = 0;
	}

	public String getName() {
		return this.unitName;
	}
	
	public String getType() {
		return this.unitType;
	}
}
