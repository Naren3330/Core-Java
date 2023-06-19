package oops;

public class Inheritance_e3 {
public static void main(String[] args) {
	roll Student1 =new roll("Sreenaren",'A',28);
	System.out.println(Student1.name);
	System.out.println(Student1.sec);
	System.out.print(Student1.rollno);
	
}
}
class Mtech_Department{
	String name;
	Mtech_Department(){
		this.name="Unknown";
	}
	Mtech_Department(String name){
		this.name=name;
	}
}
class section extends Mtech_Department{
	char sec;
	section(){
		char sec='0';
	}
	section(char sec){
		this.sec=sec;
	}
	section(String name,char sec){
		super(name);
		this.sec=sec;
	}
}
class roll extends section{
	int rollno;
	roll(){
		super();
		this.rollno=-1;
	}
	roll(int rollno){
		this.rollno=rollno;
	}
	 roll(String name, char sec, int rollno) {
		super(name, sec);
		this.rollno = rollno;
	}
}

