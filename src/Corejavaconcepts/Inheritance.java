package Corejavaconcepts;


	class Martin{
		public void demo() {
			System.out.println("house");
		}
	}
 class joseph extends Martin{
	 public void show() {
		 System.out.println("car");
	 }
 }
 class sherly extends Martin{
	 public void display() {
		 System.out.println("land");
	 }
 }
 public class Inheritance{
 public static void main(String[] args) {
  Martin m = new Martin();
  m.demo();
  joseph j = new joseph();
  j.demo();
  j.show();
	sherly s = new sherly();
	s.demo();
	s.display();
}
}
