package oops;
//hiding the unnecessary detail and showing valuable information 
public class Abstraction_e1 {
	public static void main(String [] args) {
		//we cant call like this:
		//CAR car=  new CAR();
		CAR car = new Honda();
		car.speed();
		
	}
}
abstract class CAR{
	abstract void speed();
}
class Honda extends CAR{
	void speed() {
		System.out.print("I run at a speed of 120km/hr");
	}
}
class Innova extends CAR{
	void speed() {
		System.out.print("I run at a speed of 200km/hr");
	}
}