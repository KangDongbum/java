package chapter8_2;

import java.util.ArrayList;

public class AnimalTest {
	public static void main(String[] args) {
		ArrayList<Animal>animal = new ArrayList<Animal>();
		
		animal.add(new Human());
		animal.add(new Tiger());
		animal.add(new Eagle());
		
		for(Animal animals : animal) {
			animals.move();
			if(animals instanceof Human) {
				Human human = (Human)animals;
				human.readBook();
			}else if(animals instanceof Tiger) {
				Tiger tiger = (Tiger)animals;
				tiger.hunting();
			}else if(animals instanceof Eagle) {
				Eagle eagle = (Eagle) animals;
				eagle.flying();
			}
		}
		
		
		
		// 배열 -> 동일 자료형의 연속된 공간
		/*
		Animal[] animals = new Animal[3];
		
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Eagle();
		
		for(int i = 0; i<animals.length; i++){
			animals[i].move();
		}
		*/
		
		/*
		Human human = new Human();
		human.move();
		
		Tiger tiger = new Tiger();
		tiger.move();
		
		Eagle eagle = new Eagle();
		eagle.move();
		*/
		
	}
}
