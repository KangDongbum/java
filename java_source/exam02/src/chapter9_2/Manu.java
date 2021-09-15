package chapter9_2;

public class Manu extends Car{

	@Override
	void drive() {
		System.out.println("사람이 운전을 합니다.");
		
	}

	@Override
	void stop() {
		System.out.println("사람이 브레이크를 밞아서 차를 멈춥니다.");
	}

}
