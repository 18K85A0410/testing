package Corejavaconcepts;

class A {
	void demo() {
		System.out.println("am demo");
	}
}
class B extends A{
	void show() {
		System.out.println("am show");
	}
}
class C extends A{
	void display() {
		
	}
}

public class HIrarichal {
public static void main(String[] args) {
	A a = new A();
	a.demo();
	B b = new B();
	b.demo();
	b.show();
	C c = new C();
	c.demo();
	c.display();
}
}
