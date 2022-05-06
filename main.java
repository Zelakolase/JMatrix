public class main {
	public static void main(String[] args) {
		Matrix A = new Matrix();
		Matrix B = new Matrix();
		A.insertRow(new int[] {1,2,3});
		A.insertRow(new int[] {1,0,-2});
		B.insertRow(new int[] {1,-1});
		B.insertRow(new int[] {5,2});
		B.insertRow(new int[] {3,-4});
		
		System.out.println(MatrixOperation.multiply(A, B));
	}
}
