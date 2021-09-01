package test;

public class Test {
	public static void main(String[] args) {
		Charging[] charging = new Charging[2];
		
		charging[0] = new Samsung();
		charging[1] = new Apple();
		
		for(Charging charge : charging) {
			charge.charging();
			if(charge instanceof Samsung ) {
				Samsung g1 = (Samsung)charge;
				g1.galaxy();
				System.out.print("어댑터가 다를경우 : ");
				g1.iphone();
			}
			if(charge instanceof Apple) {
				Apple a1 = (Apple)charge;
				a1.iphone();
				System.out.print("어댑터가 다를경우 : ");
				a1.galaxy();
			}
			System.out.println("----------------------------------------------------------");
		}
	}
}
