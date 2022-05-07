import java.util.ArrayList;

public class MatrixOperation {
	public static Matrix multiply(Matrix A, Matrix B) {
		Matrix out = new Matrix();
		if(A.getColumns() == B.getRows()) {
			// Calculate
			for(int i = 0;i<A.getRows();i++) {
				ArrayList<Integer> row = A.getRow(i);
				ArrayList<Integer> results = new ArrayList<>();
				for(int o = 0;o<B.getColumns();o++) {
					ArrayList<Integer> column = B.getColumn(o);
					int result = 0;
					for(int a = 0;a<row.size();a++) {
						result += row.get(a) * column.get(a);
					}
					results.add(result);
				}
				int[] ress = new int[results.size()];
				for(int b = 0;b < results.size();b++) ress[b] = results.get(b);
				out.insertRow(ress);
			}
		}else {
			throw new UnsupportedOperationException();
		}
		return out;
	}
}
