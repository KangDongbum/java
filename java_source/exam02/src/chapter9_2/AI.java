package chapter9_2;

public class AI extends Car {

	@Override
	void drive() {
		System.out.println("AI가 알아서 운전을 합니다.");
	}

	@Override
	void stop() {
		System.out.println("AI가 알아서 멈춥니다.");
	}

}
