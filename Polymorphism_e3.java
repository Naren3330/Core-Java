package oops;

public class Polymorphism_e3 {
	public static void main(String[] args) {
		Animals o1 = new Duck();//upcasting
		o1.leg();
	}
}
class Animals{
	void leg(){
		System.out.println("i am the leg");
	}
}
class Dogs extends Animals{
	@Override
	void leg() {
		System.out.println("I have 4 legs");
	}
}
class Duck extends Dogs{
	@Override
	void leg() {
		System.out.print("i have 2 legs");
	}
}
class Spider extends Duck{
	@Override
	void leg() {
		System.out.print("i have 6 legs");
	}
}