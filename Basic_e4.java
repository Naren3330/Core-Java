//Using class of another class
//constructor overloading ;
package oops;
import java.util.*;
public class Basic_e4 {
	public static void main(String[]args) {
		Employee Naren=new Employee(26,"Naren");
		Employee Naren_duplicate=new Employee(Naren);
		System.out.print(Naren_duplicate .name);
		Employee ramdom= new Employee();
		System.out.print(ramdom.name);
	}
}
class Employee{
	int roll;
	String name;
	Employee  (Employee other){
		this.name=other.name;
		this.roll=other.roll;
	}
	//the method to call constructor from another constructor
	Employee(){
		this(13,"RAVANA");
	}
	Employee(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
}