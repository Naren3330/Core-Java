package oops;
import java.util.*;
public class Encapsulation_e3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student_Info s1 = new Student_Info();
		s1.setId(sc.nextInt());
		sc.nextLine();
		s1.setName(sc.next());
		s1.setCgpa(sc.nextFloat());
		System.out.print("My ID: "+s1.getId()+"\n"+"My CGPA: " +s1.getCgpa()+" \n"+"My NAME: "+s1.getName());
	}

}
class Student_Info{
	private int id;
	private String name;
	private float cgpa;
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getCgpa(){
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa=cgpa;
	}
}