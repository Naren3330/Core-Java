
package oops;
import java.util.*;
public class Encapasulation_e2 {
public static void main(String[] args) {
	ChangeName cn = new ChangeName();
	System.out.print("Old Name:  ");
	System.out.println(cn.getName());
	cn.setName("SreeNaren");
	System.out.print("Changed Name: ");
	System.out.print(cn.getName());
	
}
}
class ChangeName{
	 private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
