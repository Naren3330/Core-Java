package oops;
import java.util.*;
public class Abstraction_e5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		int b=sc.nextInt();
		int r=sc.nextInt();
		Candy c1= new BlueCandy(b);
		c1.candyno(c);
		Candy c2 = new RedCandy(r);
		c2.candyno(c);
	}

}
abstract class Candy{
	abstract void candyno(int c);
}
class BlueCandy extends Candy{
	int b;
	BlueCandy(int b){
		this.b=b;
	}
	void candyno(int c){
		System.out.print("No.of red candies: ");
		System.out.println(c-b);
	}
}
class RedCandy extends Candy{
	int r;
	RedCandy(int r){
		this.r=r;
	}
	void candyno(int c) {
		System.out.print("No.of blue candies: ");
		System.out.print(c-r);
	}
}