package oops;

public class static_e1 {
public static void main(String[] args) {
	HumanPopulation Naren = new HumanPopulation(21,"Sreenaren","TamilNadu");
	System.out.println(HumanPopulation.population);
	HumanPopulation Nittin = new HumanPopulation(21,"NittinGanesh","TamilNadu");
	System.out.print(Nittin.population);
}
}
class HumanPopulation{
	int age;
	String name;
	String state;
	static int population;
	HumanPopulation(int age,String name,String state){
		this.age=age;
		this.name=name;
		this.state=state;
		//here we need to use class name for better convention.We can also use this keyword.
		HumanPopulation.population+=1;
	}
}
