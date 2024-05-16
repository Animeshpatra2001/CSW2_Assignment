/*21. Design a Java program that performs matrix operations such as addition, multiplication, and transpose. Introduce scenarios, where accessing elements beyond the bounds of the matrix results in ArrayIndexOutOfBoundsException. Your task is to handle these exceptions effectively and provide meaningful error messages indicating the nature of the exception.*/
package errorHandling;

import java.util.Arrays;

public class Q21 {
	public static void main(String[] args) {
		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixB = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		try {
			int[][] sum = addMatrices(matrixA, matrixB);
			System.out.println("Matrix Addition:");
			printMatrix(sum);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error during matrix addition: " + e.getMessage());
		}
		try {
			int[][] product = multiplyMatrices(matrixA, matrixB);
			System.out.println("\nMatrix Multiplication:");
			printMatrix(product);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error during matrix multiplication: " + e.getMessage());
		}
		try {
			int[][] transpose = transposeMatrix(matrixA);
			System.out.println("\nMatrix Transpose:");
			printMatrix(transpose);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error during matrix transpose: " + e.getMessage());
		}
	}

	public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
		int rows = matrixA.length;
		int columns = matrixA[0].length;
		if (matrixB.length != rows || matrixB[0].length != columns) {
			throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
		}
		int[][] sum = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		return sum;
	}

	public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
		int rowsA = matrixA.length;
		int columnsA = matrixA[0].length;
		int rowsB = matrixB.length;
		int columnsB = matrixB[0].length;
		if (columnsA != rowsB) {
			throw new IllegalArgumentException(
					"Number of columns in matrix A must equal the number of rows in matrix B formultiplication.");
		}
		int[][] product = new int[rowsA][columnsB];
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsB; j++) {
				for (int k = 0; k < columnsA; k++) {
					product[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		return product;
	}

	public static int[][] transposeMatrix(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		int[][] transpose = new int[columns][rows];
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		return transpose;
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
}