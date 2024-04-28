package robot;

public class TestRobot {

	public static void main(String[] args) {
		
		Robot codey = new Robot("Codey", "Worker");
		System.out.print(codey.getName());
		System.out.println();
		System.out.print(codey.getType());
		System.out.println();
		System.out.print(codey.getHp());
		System.out.println();
		System.out.print(codey.getAttack());
		System.out.println();
		System.out.println(codey.getDefense());
		System.out.println();
		
		Robot jeffrey = new Robot("Jeffrey", "Fighter");
		System.out.print(jeffrey.getName());
		System.out.println();
		System.out.print(jeffrey.getType());
		System.out.println();
		System.out.print(jeffrey.getHp());
		System.out.println();
		System.out.print(jeffrey.getAttack());
		System.out.println();
		System.out.println(jeffrey.getDefense());
		System.out.println();
		

	}

}
