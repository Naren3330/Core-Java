package oops;
//wrapping up the implementation of the data members and methods inside a class
 class e1 {
 private int num=10;
//getter
 public int getNum(){
	 return num;
 }
 //setter
 public void setName(int num) {
	 this.num=num;
 }
}
 public class Encapasulation_e1{
	 public static void main(String[] args) {
		 e1 obj = new e1();
		 System.out.println(obj.getNum());
		 obj.setName(28);
		 System.out.println(obj.getNum());
	 }
 }
