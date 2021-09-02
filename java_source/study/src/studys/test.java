package studys;

public class test {
	public static void main(String[] args) {
		for(int i =1; i<=30; i++) {
			if(i % 5 != 0) {
				continue;
			}
			for(int j = 1; j<=30; j++) {
				if(j % 5 != 0) {
					continue;
				}
				System.out.println(i+"X"+ j);
			}
		}
	}
}
