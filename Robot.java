package robot;

public class Robot {

	private String unitType = " ", unitName = " ";
	private int hp = 0, attack = 0, defense = 0;
	
	public Robot(String name, String unitType) {
		this.unitName = name;
		this.unitType = unitType;
		if (unitType == "Worker") {
			this.hp = 50;
		}
		this.attack = 1;
		this.defense = 0;
	}

	public String getName() {
		return this.unitName;
	}
	
	public String getType() {
		return this.unitType;
	}
}
