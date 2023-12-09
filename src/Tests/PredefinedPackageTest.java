package Tests;

import java.util.Scanner;

public class PredefinedPackageTest {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the id : ");
	
	int id = scan.nextInt();
	System.out.println("The value table is = "+id);
	int m;
	for(int i=1;i<=10;i++) {
		m=id*i;
		System.out.println(id+"*"+i+"="+m);
	}
	
	}
}
