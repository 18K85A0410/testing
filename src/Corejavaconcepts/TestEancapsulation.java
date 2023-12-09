package Corejavaconcepts;

    class Eancapsulation {

	 void demo() {
		System.out.println("am demo method");
	}
	 void show() {
		System.out.println("am show method");
	}
	 void display() {
		System.out.println("am display method");
	}
	
}
 class TestEancapsulation{
	public static void main(String[] args) {
		Eancapsulation en = new Eancapsulation();
		en.demo();
		en.show();
		en.display();
		
	}
}
