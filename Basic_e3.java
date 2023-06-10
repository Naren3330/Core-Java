//Changing name
package oops;
import java.util.*;
public class Basic_e3 {
	public static void main(String[] args) {
		Student s1 = new Student(28,"Naren");
		s1.changename("Car lover");
		System.out.print(s1.name);

	}
}
class Student {
	int roll_no;
	String name;
	Student(int roll, String naam){
		this.roll_no=roll;
		this.name=naam;
	}
	
	void changename(String newName) {
		this.name=newName;
	}

}
