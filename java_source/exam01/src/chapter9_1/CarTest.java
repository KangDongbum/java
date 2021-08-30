package chapter9_1;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop();
		autoCar.stop();
		
		/*
		Car b1 = new Bus();
		Car a1 = new AutoCar();
		
		ArrayList <Car> cartest = new ArrayList <Car>();
		cartest.add(b1);
		cartest.add(a1);
		
		for(Car cartests : cartest) {
			cartests.run();
			if(cartests instanceof Bus) {
				Bus take = (Bus)cartests;
				take.takePassenger();
			}
			if(cartests instanceof AutoCar) {
				AutoCar load = (AutoCar)cartests;
				load.load();
			}
			cartests.refuel();
			cartests.stop();
		}
		*/
	}
}
