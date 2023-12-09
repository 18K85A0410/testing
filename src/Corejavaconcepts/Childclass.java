package Corejavaconcepts;

public class Childclass extends Parentclassdemo {
	public void speedrpm() {
		System.out.println("speed is implemented");
	}
	public void color() {
		System.out.println(color);
	}
	public void Hello() {
		System.out.println("hello");
	}

	 public static void main(String[] args) {
		Childclass cd = new Childclass();
		cd.breaks();
		cd.gear();
		cd.color();
		cd.speedrpm();
	}
}
 