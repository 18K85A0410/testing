package Corejavaconcepts;

public class Constructor {
	public Constructor(){
		System.out.println("am constructor");	}
	public Constructor(String str) {
		System.out.println(str);
	}
	public Constructor(int a , int b) {
		int c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
	
	Constructor c = new Constructor();
	Constructor cr = new Constructor("Hello");
	Constructor cd = new Constructor(4,6);
	}
}
