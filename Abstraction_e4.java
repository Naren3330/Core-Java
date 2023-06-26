package oops;

public class Abstraction_e4 {
	public static void main(String [] sss) {
		Doggy a1 = new Doggy();
		a1.leg();
		Animal_1 a2  =new Ducky();
		a2.leg();
	}
}
abstract class Animal_1{
	abstract void leg();
}

class Doggy extends Animal_1{
	void leg() {
		System.out.println("I have 4 legs");
	}
}
class Ducky extends Animal_1{
	void leg() {
		System.out.println("I have two legs");
	}
}