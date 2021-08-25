package chapter6_1;

public class SingleTon {
	private static SingleTon instance = new SingleTon();
	private SingleTon(){}
	
	public static SingleTon getInstance() {
		if(instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		SingleTon st1 = new SingleTon();
		SingleTon st2 = new SingleTon();
		
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		// s1, s2는 동일한 인스턴스, 동일한 주소
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
	}
}
