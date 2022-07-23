package codewars.nivel.cuatro;

//Given an n x n array, 
//return the array elements arranged from outermost elements to the middle element, traveling clockwise.

//array = [[1,2,3],
//         [4,5,6],
//         [7,8,9]]
//snail(array) #=> [1,2,3,6,9,8,7,4,5]

//For better understanding, please follow the numbers of the next array consecutively:
//	
//array = [[1,2,3],
//	     [8,9,4],
//	     [7,6,5]]
//snail(array) #=> [1,2,3,4,5,6,7,8,9]


public class Snail {

	public static int[] snail(int[][] array) {
		int i, k = 0, l = 0;
		int m = array.length;
		int n = array[0].length;
		int size = m * n;
		int output[] =new int[size];
		int counter = 0;

		/*
		 * k - starting row index m - ending row index l - starting column index n -
		 * ending column index i - iterator
		 */
		while (k < m && l < n) {
			// Print the first row from the remaining rows
			for (i = l; i < n; ++i) {
				output[counter] = array[k][i];
				counter++;
			}
			k++;

			// Print the last column from the remaining
			// columns
			for (i = k; i < m; ++i) {
				output[counter] = array[i][n - 1];
				counter++;
			}
			n--;

			// Print the last row from the remaining rows */
			if (k < m) {
				for (i = n - 1; i >= l; --i) {
					output[counter] = array[m-1][i];
					counter++;
				}
				m--;
			}

			// Print the first column from the remaining
			// columns */
			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					output[counter] = array[i][l];
					counter++;
				}
				l++;
			}
		}

		return output;
	}
}