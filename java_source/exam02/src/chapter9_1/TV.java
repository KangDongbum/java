package chapter9_1;

//인스턴스 만들면X -> abstract
public abstract class TV {
	void ON() {
		System.out.println("전원 켜기");
	}
	
	void OFF() {
		System.out.println("전원 끄기");
	}
}
