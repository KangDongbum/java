package chapter9_2;

public abstract class Car {
	abstract void drive(); // 일반 승용차(Manual Car -> 운전자 운전, 자율 주행차 -> AI가 운전)
	abstract void stop();
	public void startCar() {
		System.out.println("시동 켜기");
	}
	public void turnOff() {
		System.out.println("시동 끄기");
	}
	
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
