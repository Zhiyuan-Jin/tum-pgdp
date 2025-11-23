package pgdp.matrix;

import static pgdp.matrix.MatrixMultiplication.matrixMult;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Führe die main Methode aus, nachdem du die Matrizenmultiplikation
		// implementiert hast.

		// Beispiel 1

		int[][] A = { //
				{ 3, 6 }, //
				{ 4, 1 } //
		};

		int[][] B = { //
				{ 0, 1 }, //
				{ 1, 0 } //
		};

		int[][] result = matrixMult(A, B);
		System.out.println(Arrays.deepToString(result));

		// Beispiel 2

		int[][] C = { //
				{ 3, 2 }, //
				{ 1, 4 }, //
				{ 1, 2 } //
		};

		int[][] D = { //
				{ 1, 0 }, //
				{ 0, 1 }//
		};

		result = matrixMult(C, D);
		System.out.println(Arrays.deepToString(result));
	}
}
