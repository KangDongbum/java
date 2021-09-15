package chapter9;

public class Desk extends Com{
	void cpu() {
		System.out.println("데스크탑 CPU");
	}

	@Override
	void mainBoard() {
		System.out.println("데스크탑 메인보드");
	}
}
