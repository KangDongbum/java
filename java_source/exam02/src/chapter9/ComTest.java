package chapter9;

public class ComTest {
	public static void main(String[] args) {
		Note n1 = new Note();
		Desk d1 = new Desk();
		
		Com n2 = new Note();
		Com D2 = new Desk();
		
		Com[] c1 = new Com[2];
		c1[0] = n1;
		c1[1] = d1;
	}
}
