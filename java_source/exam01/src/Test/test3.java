package Test;

public class test3 {
	public static void main(String[] args) {
		int health = 5;
		String floor = null;
		
		switch(health) {
		case 1 : floor = "�౹";
		break;
		case 2 : floor = "�����ܰ�";
		break;
		case 3 : floor = "�Ǻΰ�";
		break;
		case 4 : floor = "ġ��";
		break;
		case 5 : floor = "�ｺŬ��";
		}
		
		System.out.println(health + "�� " + floor + "�Դϴ�.");
	}
}
