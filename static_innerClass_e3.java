package oops;

public class static_innerClass_e3 {
	//Always we need to use static for innerclass so that it can be called in main class using objects;
	static class A{
		String name;
		int roll_no;
		A(String name,int roll_no){
			this.name=name;
			this.roll_no=roll_no;
		}
	}
	public static void main(String [] args) {
		A obj = new A("Sreenaren",28);
		System.out.println(obj.name);
		System.out.print(obj.roll_no);
	}
}
