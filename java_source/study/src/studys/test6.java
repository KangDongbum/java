package studys;

public class test6 {
	public static void main(String[] args) {
		
		for(int i =11; i<20; i++) {
			for(int j=11; j<20; j++ ) {
				if(j>= i) {
					System.out.println(i+"X"+j +"=" + i*j);
				}
			}
		}
	}
}
