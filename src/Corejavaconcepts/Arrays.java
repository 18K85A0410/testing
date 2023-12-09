package Corejavaconcepts;

import java.util.ArrayList;

public class Arrays {
	public void abc() {
		System.out.println("hello");
	}

    
	public static void main(String[] args) {
	int[] arr = new int[5];
	arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	arr[3] = 4;
	arr[4] = 5;
	for(int i = 0; i<=arr.length;i++) {
		System.out.println(arr[i]);
		System.out.println("*******************");
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("joseph");
		a.add("david");
		for(int j = 0;j<a.size();j++) {
			System.out.println(a.get(j));
		}
	}

	}

}
