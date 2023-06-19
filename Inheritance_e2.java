package oops;

public class Inheritance_e2 {
public static void main(String[] args) {
	Bonus e1=new Bonus("Sreenaren",1000000,400000);
	Employees e2=new Employees();
	System.out.println("Name: "+e1.name);
	System.out.println("Bonus: "+e1.bonus);
	System.out.println("Salary: "+e1.salary);
	e1.yo();
}
}
class Employees{
	String name;
	int salary;
	Employees(){
		this.name="Naren";
		this.salary=200000;
	}
	Employees(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	
}
class Bonus extends Employees{
	int bonus;
	Bonus(String name,int salary,int bonus){
		super(name,salary);
		this.bonus=50000;

	}
	void yo() {
		System.out.print("The total salary is: "+ (this.bonus+this.salary));
	}
}
 