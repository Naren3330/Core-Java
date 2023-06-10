//Storing Student Details
package oops;
import java.util.*;
public class Basic_e2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student1 Naren =new Student1();
		System.out.println(Naren.roll_no);
		System.out.println(Naren.name);
		System.out.println(Naren.marks);
		Student2 Ram=new Student2();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(Ram.roll_no);
		System.out.println(Ram.name);
		System.out.println(Ram.marks);
		
		}
}
class Student1{
		int roll_no;
		String name;
		float marks;
		Student1(){
			this.roll_no=28;
			this.name="Sreenaren";
			this.marks=87.88f;
		}
}
class Student2{
	int roll_no;
	String name;
	float marks;
	Student2(){
		this.roll_no=20;
		this.name="Ram Prakash";
		this.marks=88.22f;
	}
}
