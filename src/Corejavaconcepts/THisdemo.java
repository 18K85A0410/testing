package Corejavaconcepts;

public class THisdemo {
	int a = 3;
	public void getdata() {
		int a = 2;
		int b = a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		this.a = a;
	}
	
	public static void main(String[] args) {
		THisdemo d = new THisdemo();
		d.getdata();
	}

}
