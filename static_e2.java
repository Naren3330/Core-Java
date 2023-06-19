package oops;

public class static_e2 {
public static void main(String [] args) {
	Calculator math = new Calculator();
    Calculator.addition(10, 50);
    System.out.println();
	math.subtraction(50, 25);
	System.out.println();
	Calculator.multiplication(32, 42);
	System.out.println();
	math.division(100, 5);
}
}
class Calculator{
	int a;
	int b;
	static void addition(int a,int b) {
		System.out.print(a+b);
	}
	static void subtraction(int a,int b) {
		System.out.print(a-b);
	}
	static void multiplication(int a,int b) {
		System.out.print(a*b);
	}
	static void division(int a, int b) {
		System.out.print(a/b);
	}
}
