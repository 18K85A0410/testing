package Corejavaconcepts;
 class Dog extends Animal{

	@Override
	public void name() {
	System.out.println("name = Tom");
		
	}

	@Override
	public void eat() {
		System.out.println("eat = Curdrice");
		
	}

	@Override
	public void colour() {
		System.out.println("colour = white");
		
	}
	
}
 class Cat extends Animal{

	@Override
	public void name() {
	System.out.println("name = jerry");	
		
	}

	@Override
	public void eat() {
		System.out.println("eat = biscuts");
		
	}

	@Override
	public void colour() {
	System.out.println("colour = black");
		
	}
	
}
public class Testabstract {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		a1.colour();
		a1.eat();
		a1.info();
		a1.name();
		
	}



}
