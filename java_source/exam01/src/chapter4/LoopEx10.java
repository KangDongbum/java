package chapter4;

public class LoopEx10 {
	public static void main(String[] args) {
		for(int i =1; i <=100; i++) {
			if(i % 3 != 0) { // 3�� ����� �ƴѰ��� �ǳʶٱ�
				continue;
			}
		
		System.out.println(i);
	}
}
}