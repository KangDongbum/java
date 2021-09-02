package chapter8_1;

public class AnimalTest {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		Object o  = new Eagle();
		
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Eagle();
		
		for(Animal ani : animals) {
			ani.move();
			if(ani instanceof Human) {
				Human human = (Human)ani;
				human.readBook();
			}else if(ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
			}else if(ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.fly();
			}
		}
	}
}
