package oops;

public class Abstraction_e3 {
	public static void main(String[] args) {	
Flower f1 = new Rose();
f1.smell();
Flower f2 = new lavender();
f2.smell();
	}
}
abstract class Flower{
	abstract void smell();
}
class Rose extends Flower{
	void smell() {
		System.out.println("i smell good");
	}
}
class lavender extends Flower{
	void smell() {
		System.out.println("I smell okish");
	}
}
