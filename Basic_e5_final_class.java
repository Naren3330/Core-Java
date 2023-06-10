package oops;

public class Basic_e5_final_class {
public static void main(String[] args) {
	final A operation = new A("Sreenaren",28);
	operation.name="SREENAREN";
	//when non-primitive is final ,we cannot re-assign it  
	//operation=new A("Ram",28);
	System.out.print(operation.name);
	System.out.println();
	System.out.print(operation.roll_no);
	
	
}
}
class A{
	String name;
	int roll_no;
	A(String naam,int roll){
		this.name=naam;
		this.roll_no=roll;
	}
	
}
