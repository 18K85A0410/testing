package Corejavaconcepts;

public class Pritningminimum {
public static void main(String[] args) {
	int a[][] = {{3,1,2},{4,5,6},{8,9,7}};
	int min = a[0][0];
	int minim = 0;
	for(int i = 0 ; i<3;i++) {
		for(int j = 0;j<3;j++) {
			if(a[i][j]<min) {
				min = a[i][j];
				minim = j;
				
			}
			
		}
	}
	int max = a[0][minim];
	int k = 0;
	while(k<3) {
	if(a[k][minim]<max) {
		max = a[k][minim];
	}
	k++;
	}
	System.out.println(max);
}
}
