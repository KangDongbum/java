package chapter9_2;

public class CarTest {
	public static void main(String[] args) {
		AICar ai = new AICar();
		ManualCar manual = new ManualCar();
		System.out.println("----------- 자율 주행 -----------");
		ai.run();
		
		System.out.println("----------- 사람이 운전 -----------");
		manual.run();
	}
}
