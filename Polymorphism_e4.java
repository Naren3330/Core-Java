package oops;

public class Polymorphism_e4 {
	public static void main(String[] args) {
		Bike b1 = new Ktm();
		b1.Speed();
		Bike b2= new Splendor();
		b2.Speed();
		Bike b3 = new Ducati();
		b3.Speed();
	}
}
class Bike{
	void Speed() {
		System.out.println("I am the speed");
	}
}
class Splendor extends Bike{
	@Override
	void Speed() {
		System.out.println("I am speeding at 60km/hr");
	}
}
class Ktm extends Bike{
	@Override
	void Speed() {
		System.out.println("I am speeding at 100km/hr");
	}
}
class Ducati extends Bike{
	@Override
	void Speed() {
		System.out.println("I am speeding at 200km/hr");
	}
}
