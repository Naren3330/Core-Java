package oops;
//Hierarchical Inheritance
public class Inheritance_e4 {
	public static void main(String [] args) {
		Dog jack = new Dog();
		jack.dog();
		jack.pet();
		
		Cat rose =new Cat();
		rose.cat();
		rose.pet();
	}
}
class Pet{
	void pet() {
		System.out.println("Eats......Sleeps");
	}
}
class Dog extends Pet{
	void dog() {
		System.out.println("barks");
	}
}
class Cat extends Pet{
	void cat() {
		System.out.println("meows");
	}
}
