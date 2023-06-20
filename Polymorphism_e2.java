package oops;
//using overloading
//static polymorphism
public class Polymorphism_e2 {
	public static void main(String[] args) {
		Number o1=new Number();
		System.out.println(o1.sum(10, 32));
		System.out.print(o1.sum(10, 32, 52));
	}
}
class Number{
	int sum(int a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	double sum(double a,int b) {
		return a+b;
	}
}
