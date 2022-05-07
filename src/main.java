public class main {
	public static void main(String[] args) {
		Matrix A = new Matrix(2,3);
		Matrix B = new Matrix(3,2);
		A.insertRow(new double[] {1,2,3});
		A.insertRow(new double[] {1,0,-2});
		B.insertRow(new double[] {1,-1});
		B.insertRow(new double[] {5,2});
		B.insertRow(new double[] {3,-4});
		// Multiply
		System.out.println(MatrixOperation.multiply(A, B)+"\n");
		// Scalar Multiply
		System.out.println(MatrixOperation.multiply(A, 2d)+"\n");
	}
}
