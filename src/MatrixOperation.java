import java.util.ArrayList;

public class MatrixOperation {
	public static Matrix multiply(Matrix A, Matrix B) {
		if(A.getColumns() == B.getRows()) {
			Matrix out = new Matrix(A.getRows(), B.getColumns());
			// Calculate
			for(int i = 0;i<A.getRows();i++) {
				ArrayList<Double> row = A.getRow(i);
				ArrayList<Double> results = new ArrayList<>();
				for(int o = 0;o<B.getColumns();o++) {
					ArrayList<Double> column = B.getColumn(o);
					double result = 0;
					for(int a = 0;a<row.size();a++) {
						result += row.get(a) * column.get(a);
					}
					results.add(result);
				}
				double[] ress = new double[results.size()];
				for(int b = 0;b < results.size();b++) ress[b] = results.get(b);
				out.insertRow(ress);
			}
			return out;
		}else {
			throw new UnsupportedOperationException();
		}
	}
	public static Matrix multiple(Matrix in, double scalar) {
		Matrix out = new Matrix(in.getRows(), in.getColumns());
		for(int i = 0;i<in.getRows();i++) {
			ArrayList<Double> row = in.getRow(i);
			double[] stuff = new double[row.size()];
			for(int b = 0;b < row.size();b++) stuff[b] = row.get(b) * scalar;
			out.insertRow(stuff);
		}
		return out;
	}
	
}
