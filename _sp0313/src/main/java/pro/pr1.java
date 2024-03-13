package pro;

import java.util.Iterator;

public class pr1 {

	public static void main(String[] args) {

		int[][] a = {{27,13,21,45,12},
				{27,13,21,45,12},
				{27,13,21,45,12}};
		int sum,ssum = 0;
		for (int i = 0; i < 3; i++) {
			sum = 0;
			for (int j = 0; j < 5; j++) {
				sum += a[i][j];
			}
			ssum += sum;
			System.out.println(ssum);
		}
	}
}
