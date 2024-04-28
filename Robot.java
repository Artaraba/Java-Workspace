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
}package robot;

public class Robot {

	private String unitType = " ", unitName = " ";
	private int hp = 0, attack = 0, defense = 0;
	
	public Robot(String name, String unitType) {
		this.unitName = name;
		this.unitType = unitType;
		
		if (unitType == "Worker") {
			this.hp = 50;
		} else if (this.unitType == "Fighter") {
			this.hp = 75;
		}
		
		if (unitType == "Worker") {
			this.attack = 1;
		} else if (this.unitType == "Fighter") {
			this.attack = 5;
		}	
		
		if (unitType == "Worker") {
			this.defense = 0;
		} else if (this.unitType == "Fighter") {
			this.defense = 5;
		}

	}

	public String getName() {
		return this.unitName;
	}
	
	public String getType() {
		return this.unitType;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAttack() {
		return this.attack;
	}
	
	public int getDefense() {
		return this.defense;
	}
}
