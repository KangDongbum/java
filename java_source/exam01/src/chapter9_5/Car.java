package chapter9_5;

public abstract class Car {
	abstract void start();
	abstract void drive();
	abstract void stop();
	abstract void turnoff();
	
	void washCar() {
		System.out.println("세차를 합니다.");
	}
	
	public final void run(){
		start();
		drive();
		stop();
		turnoff();
	}

}
