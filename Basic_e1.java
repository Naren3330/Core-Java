//Greeting Message
package oops;
import java.util.*;
public class Basic_e1 {
	public static void main(String[] args) {
		Greeting message = new Greeting();
		System.out.print(message.m);
		message.greeting();
	}
}
	class Greeting{
		String m="Welcome everyone,";
		void greeting() {
			System.out.print("This is my core java practice session");
		}
	}

