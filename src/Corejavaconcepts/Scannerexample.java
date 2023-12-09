package Corejavaconcepts;

import java.util.Scanner;

public class Scannerexample {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
for(int i = 1;i<=3;i++) {
System.out.println("Enter username");
String name = sc.nextLine();
System.out.println("Enter password");
String password = sc.nextLine();
if(name.equals("joseph")&&password.equals("Test@123")) {
System.out.println("Welcome to the party");
break;
}
else {
	System.out.println("you are entered wrong password and username");
}
System.out.println("Enter valid username and password");
}
}
}