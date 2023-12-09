package Corejavaconcepts;

public class Childdemo extends Parentdemo {
	String name = "Joseph";
	public void getData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("I am child constuctor");
	}
	public Childdemo() {
		super();
		System.out.println("I am child");
	}
	public static void main(String[] args) {
		Childdemo d = new Childdemo();
		d.getData();
		d.getInfo();
	
	}

}
