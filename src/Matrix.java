import java.util.ArrayList;
public class Matrix {
	//        Row       Values in rows
	private ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
	private int MAX_ROWS = 0;
	private int MAX_COLS = 0;
	/**
	 * Constructor for class, sets a limit for the matrix size
	 */
	public Matrix(int row, int column) {
		MAX_COLS = column;
		MAX_ROWS = row;
	}
	/**
	 * Gets number of rows
	 * @return number of rows
	 */
	public int getRows() {
		return matrix.size();
	}
	/**
	 * Gets number of columns
	 * @return number of columns
	 */
	public int getColumns() {
		if(matrix.size() > 0) return matrix.get(0).size();
		else return 0;
	}
	/**
	 * Inserts a new row with the values
	 * @param values data to be inserted
	 */
	public void insertRow(double[] values) {
		if(values.length == MAX_COLS && matrix.size() <= MAX_ROWS) {
		matrix.add(new ArrayList<Double>() {
			{
				for(double value : values) {
					add(value);
				}
			}
		}
			);
		}else {
			throw new UnsupportedOperationException();
		}
	}
	/**
	 * Gets a value using row and column number
	 * @param row target row num.
	 * @param column target column num.
	 * @return value of that position
	 */
	public double get(int row, int column) {
		return matrix.get(row).get(column);
	}
	/**
	 * Gets an entire row
	 */
	public ArrayList<Double> getRow(int index) {
		return matrix.get(index);
	}
	/**
	 * Gets an entire column
	 */
	public ArrayList<Double> getColumn(int index) {
		ArrayList<Double> column = new ArrayList<>();
		for(ArrayList<Double> row : matrix) {
			column.add(row.get(index));
		}
		return column;
	}
	/**
	 * To string overrided func.
	 * @return the string representation of the matrix
	 */
	@Override
	public String toString() {
		String out = "";
		for(ArrayList<Double> row : matrix) {
			System.out.println(row.toString()
					.replaceFirst("\\[", "")
					.replaceFirst("\\]", ""));
		}
		return out;
	}
}
