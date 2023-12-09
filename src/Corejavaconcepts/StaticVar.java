package Corejavaconcepts;

public class StaticVar {
	String name;
	String address;
	static String city;
	static int i;
	static {
		city = "Hyderabad";
		 int i = 0;
	}
	public StaticVar(String name, String address) {
		this.name = name;
		this.address = address; 
		this.city = city;
		i++;
		System.out.println(i);
	}
	public void getaddress(){
		System.out.println(address+" "+city );
	}
	public static void getCity() {
		System.out.println(city);
	}
	public static void main(String[] args) {
		StaticVar obj1 = new StaticVar("Joseph","Medchal");
		StaticVar obj2 = new StaticVar("David","Dabilpur");
		obj1.getaddress();
		obj2.getaddress();
		StaticVar.getCity();
	}

}
