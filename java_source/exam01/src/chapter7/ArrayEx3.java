package chapter7;

public class ArrayEx3 {
	public static void main(String[] args) {
		System.out.println('A' +1); // 'A' -> char(2바이트 정수) + 1(int - 4바이트 정수)
		
		char[] alpha = new char[26]; //2바이트씩 총 52개의 연속 공간 -> 인덱스 번호로 접근
		char ch = 'A'; //정수 65
		for (int i=0; i<alpha.length; i++) {
			alpha[i] = ch++;
			//ch++ -> ch(char) +1(int) -> int(묵시적 형변환) -> 저장이 char이라서 아스키코드 문자 출력
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i]);
		}
	}
}
