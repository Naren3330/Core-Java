package oops;

public class Inheritance_e1 {
public static void main(String [] args) {
	BoxWeight box1=new BoxWeight();
	System.out.println(box1.weight+"   "+box1.height);
	BoxWeight box2=new BoxWeight(10,20,30,40);
	System.out.print(box2.width+"   "+box2.length+"   "+box2.height+"   "+box2.weight);
}
}
class Box {
	int width;
	int length;
	int height;
	Box(){
		this.width=1;
		this.length=1;
		this.height=1;
	}
	Box(int w,int l,int h){
		this.width=w;
		this.length=l;
		this.height=h;
	}
}
class BoxWeight extends Box{
	int weight;
	BoxWeight(){
		this.weight=10;
	}
	BoxWeight(int w,int l,int h,int wi){
		super(w,l,h);
		this.weight=wi;
	}
	
}
