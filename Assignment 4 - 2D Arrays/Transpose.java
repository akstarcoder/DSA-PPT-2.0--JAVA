/*
💡 **Question 3**

Given a 2D integer array matrix, return *the **transpose** of* matrix.

The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

**Example 1:**

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]

Output: [[1,4,7],[2,5,8],[3,6,9]]

*/


class Solution {
public int[][] transpose(int[][] A) {
	//dimensions
	int M = A.length; int N = A[0].length;

	//result matrix (w/ size from transposition)
	int[][] B = new int[N][M];

	//iterate thru A
	for (int i = 0; i < M; i++) {
		for (int j = 0; j < N; j++) {
			//transpose
			B[j][i] = A[i][j];
		}
	}

	return B;
}
}