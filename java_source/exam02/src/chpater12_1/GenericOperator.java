package chpater12_1;

public class GenericOperator<T> { // 인스턴스가 생성될때(힙에 올라갈때)
	T num1;
	T num2;
	
	public static <T,V> double add(T num1,V num2) { //호출될때 마다 자료형 투입 -> 스택에서 호출
		/**
		 *  T, V -> 숫자는 맞다. 정수인지, 실수 인지 알수 없다.
		 *  	  -> 숫자(Integer, Double, Float, Long ...)
		 *  	  숫자 Wrapper 자료형의 공통점 -> Number 클래스를 상속받고 있다.
		 */
		
		double num11 = ((Number)num1).doubleValue();
		double num22 = ((Number)num2).doubleValue();
		
		return num11+num22;
	}
}