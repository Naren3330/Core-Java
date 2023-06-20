package oops;
//Act of representing same thing in multiple ways!!
public class Polymorphism_e1 {
 public static void main(String[] args) {
	Shapes s1 = new Shapes();
	s1.area();
	
	Circles c1=new Circles();
	c1.area();
	//we can also call like:
	Shapes r1=new Rectangles();
	r1.area();
}
}
class Shapes{
	void area() {
		System.out.println("Yo!I am the shape");
	}
}
class Circles extends Shapes {
	void area() {
		System.out.println("I am a Circle");
	}
}
class Rectangles extends Shapes{
	void area() {
		System.out.println("I am a Rectangle");
	}
}
class Triangles extends Shapes{
	void area() {
		System.out.println("I am a Triangle");
	}
}
