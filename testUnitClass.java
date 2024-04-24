package unit;

import java.util.Scanner;

public class TestUnit {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What type of unit do you wish to create?");
		String unitType = input.next();
		System.out.print(unitType);
		Unit unitOne = new Unit(unitType);
	}
}
