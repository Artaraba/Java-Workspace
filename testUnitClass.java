// This is a program to test the UnitClass.java file

import java.util.Scanner;

public class testUnitClass {
		public static void main(String[] args) {
			System.out.println("What type of unit would you like to create?");
			System.out.print("Worker, Fighter, Mage, Elite: ");
			String unitType = input.next();
			
			if (unitType = "Worker") {
				Worker worker = new Worker();
			}
			
			System.out.print(worker.unitName, + "," + worker.hp + "," + worker.attack + "," + worker.defense);
		}
	
}