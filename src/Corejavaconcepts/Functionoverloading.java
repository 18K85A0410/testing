package Corejavaconcepts;

public class Functionoverloading {
public void getdata(int a,int b, int c) {
	int x = a+b+c;
	System.out.println("hello"+x);
}
public void getdata(int a, int b) {
	int x = a+b;
	
	System.out.println("world"+x);
}
public void getdata(String a) {
	System.out.println("hai");
}
public static void main(String[] args) {
	Functionoverloading c = new Functionoverloading();
	c.getdata(20, 30);
    c.getdata(20, 30, 40);
	
}
}
