package Test;

public class test3 {
	public static void main(String[] args) {
		int health = 5;
		String floor = null;
		
		switch(health) {
		case 1 : floor = "약국";
		break;
		case 2 : floor = "정형외과";
		break;
		case 3 : floor = "피부과";
		break;
		case 4 : floor = "치과";
		break;
		case 5 : floor = "헬스클럽";
		}
		
		System.out.println(health + "층 " + floor + "입니다.");
	}
}
