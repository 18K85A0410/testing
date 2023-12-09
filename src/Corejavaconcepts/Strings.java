package Corejavaconcepts;

import java.util.Arrays;
import java.util.List;

public class Strings {
	public static void main(String[] args) {
		String s = "Joseph david shetty";
		String[] splitted = s.split("david");
		System.out.println(splitted[0]);
		System.out.println(splitted[1]);
		System.out.println(splitted[1].trim());
		//for(int i = 0; i<=s.length();i++) {
			//System.out.println(s.charAt(i));
		for(int i = s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
		String[] name = {"joseph","david","shetty"};
		 List<String>a = Arrays.asList(name);
		 System.out.println(a.contains("david"));
		}
		
	}


