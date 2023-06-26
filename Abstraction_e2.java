package oops;

public class Abstraction_e2 {
	public static void main(String[] args) {
		Calculations c1 = new ADD(24,43);
		c1.num();
		Calculations c2 = new MULTIPLY(32,23);
		c2.num();
	}
}
abstract class Calculations{
	int num1;
	int num2;
	Calculations(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	abstract void num();
}
class ADD extends Calculations{
	ADD(int num1,int num2){
		super(num1,num2);
	}
	void num() {
		System.out.println(num1+num2);
	}
}
class MULTIPLY extends Calculations{
	MULTIPLY(int num1,int num2){
		super(num1,num2);
	}
	void num() {
		System.out.println(num1*num2);
	}
}
