package chapter9_5;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		/*ArrayList <Car> carList = new ArrayList();
		carList.add(new Sonata());
		carList.add(new Avante());
		carList.add(new Grandeur());
		carList.add(new Genesis()); */
		
		Car[] carList = new Car[4];
		carList[0] = new Sonata();
		carList[1] = new Avante();
		carList[2] = new Grandeur();
		carList[3] = new Genesis();
		
		for(Car car : carList) {
			car.run();
			car.washCar();
			System.out.println("==============================");
		}
	}
}