package oops;

public class Polymorphism_e5 {
	public static void  main(String[] args) {
		Banks b1 = new HDFC();
		b1.Rate();
		Banks b2=  new SBI();
		b2.Rate();
	}
}
class Banks{
	void Rate() {
		float rate=0f;
		System.out.println(rate);
	}
}
class HDFC extends Banks{
	@Override
	void Rate() {
		float rate=4.5f;
		System.out.println(rate);
	}
}
class SBI extends Banks{
	@Override
	void Rate() {
		float rate = 6.7f;
		System.out.println(rate);
	}
}
class Axis extends Banks{
	@Override
	void Rate() {
		float rate=7.8f;
		System.out.println(rate);
	}
}
