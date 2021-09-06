package studys;

public class test151 {
	public static void main(String[] args) {
		test11 t1 = new test11();
		test11[] t2 = new test11[2];
		int[] t3 = new int[3];
		
 		t3[0]= 3;
		
		t1.num1 = 11;
		t1.abc = "abc";
		
		t2[0] = new test11(1,"asd");
	}
}
