package codewars.nivel.cuatro;

public class Snail {

	public static int[] snail(int[][] array) {
		int i, k = 0, l = 0;
		int m = array.length;
		int n = array[0].length;

		/*
		 * k - starting row index m - ending row index l - starting column index n -
		 * ending column index i - iterator
		 */
		while (k < m && l < n) {
			// Print the first row from the remaining rows
			for (i = l; i < n; ++i) {
				System.out.print(array[k][i] + " ");
			}
			k++;

			// Print the last column from the remaining
			// columns
			for (i = k; i < m; ++i) {
				System.out.print(array[i][n - 1] + " ");
			}
			n--;

			// Print the last row from the remaining rows */
			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					System.out.print(array[m - 1][i] + " ");
				}
				m--;
			}

			// Print the first column from the remaining
			// columns */
			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					System.out.print(array[i][l] + " ");
				}
				l++;
			}
		}

		return null;
	}
}