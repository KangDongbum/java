package Test;

public class test2 {
	public static void main(String[] args) {
		
		for (int i =0; i<40; i++) {
			int student = i +1 ;
			int room =  i % 10;
			System.out.println("학생" + student + ", 방번호 " + room + "번"); 
		}
	}
}
