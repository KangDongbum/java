package chapter9_2;

public abstract class Car {
	abstract void drive(); // �Ϲ� �¿���(Manual Car -> ������ ����, ���� ������ -> AI�� ����)
	abstract void stop();
	public void startCar() {
		System.out.println("�õ� �ѱ�");
	}
	public void turnOff() {
		System.out.println("�õ� ����");
	}
	
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
