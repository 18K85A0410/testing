package Corejavaconcepts;
class A1{
	void demo() {
		System.out.println("hello");
	}
}
class B12 extends A1{
	void show() {
		System.out.println("world");
	}

class C extends  B12 {
void display() {
	System.out.println("hai");
	
	
}
public class Testmultilevel {
	public static void main(String[] args) {
		A1 a = new A1();
		a.demo();
		B12 b = new B12();
		b.demo();
		b.show();
		C c = new C();
		c.display();
		c.show();
		c.demo();
	}
} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
