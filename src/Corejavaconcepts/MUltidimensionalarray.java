package Corejavaconcepts;

public class MUltidimensionalarray {
	public static void main(String[] args) {
		int[][] a  = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		for(int i = 0; i<2;i++) {
			for(int j = 0; j<3;j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
