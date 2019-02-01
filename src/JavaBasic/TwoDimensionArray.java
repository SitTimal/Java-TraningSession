package JavaBasic;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x[][] = new String[3][5];

		System.out.println(x.length);// total number of rows

		System.out.println(x[0].length); // total number of column.

		x[0][0] = "a";
		x[0][1] = "b";
		x[0][2] = "c";
		x[0][3] = "d";
		x[0][4] = "e";

		x[1][0] = "a1";
		x[1][1] = "b1";
		x[1][2] = "c1";
		x[1][3] = "d1";
		x[1][4] = "e1";

		x[2][0] = "a2";
		x[2][1] = "b2";
		x[2][2] = "c2";
		x[2][3] = "d2";
		x[2][4] = "e2";

		System.out.println(x[1][2]);
		System.out.println(x[2][2]);

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[0].length; col++) {
				System.out.println(x[row][col]);

			}

		}

	}

}
