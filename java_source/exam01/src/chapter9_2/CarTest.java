package chapter9_2;

public class CarTest {
	public static void main(String[] args) {
		AICar ai = new AICar();
		ManualCar manual = new ManualCar();
		System.out.println("----------- ���� ���� -----------");
		ai.run();
		
		System.out.println("----------- ����� ���� -----------");
		manual.run();
	}
}
