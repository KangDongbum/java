package chpater12_1;

public class GenericOperator<T> { // �ν��Ͻ��� �����ɶ�(���� �ö󰥶�)
	T num1;
	T num2;
	
	public static <T,V> double add(T num1,V num2) { //ȣ��ɶ� ���� �ڷ��� ���� -> ���ÿ��� ȣ��
		/**
		 *  T, V -> ���ڴ� �´�. ��������, �Ǽ� ���� �˼� ����.
		 *  	  -> ����(Integer, Double, Float, Long ...)
		 *  	  ���� Wrapper �ڷ����� ������ -> Number Ŭ������ ��ӹް� �ִ�.
		 */
		
		double num11 = ((Number)num1).doubleValue();
		double num22 = ((Number)num2).doubleValue();
		
		return num11+num22;
	}
}