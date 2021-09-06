package studys;

public class test22 {
	String test;
	int ID;
	
	public test22() {}
	
	public test22(String test) {
		this.test = test;
	}
	
	public String toString() {
		return "æ»≥Á«œººø‰!";
	}
	
	public int hashCode() {
		return ID;
	}
	
	public boolean equals (Object obj) {
		test22 IDs = (test22)obj;
		if(IDs.ID == ID) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		test22 a1 = new test22();
		
		System.out.println(a1);
		
		test22 b1 = new test22("abc");
		test22 b2 = new test22("abc");
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		System.out.println(b1.equals(b2));
		
	}
}
