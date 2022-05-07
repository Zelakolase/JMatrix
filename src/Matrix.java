import java.util.ArrayList;
public class Matrix {
	//        Row       Values in rows
	private ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
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
	public void insertRow(int[] values) {
		matrix.add(new ArrayList<Integer>() {
			{
				for(int value : values) {
					add(value);
				}
			}
		}
			);
	}
	/**
	 * Gets a value using row and column number
	 * @param row target row num.
	 * @param column target column num.
	 * @return value of that position
	 */
	public int get(int row, int column) {
		return matrix.get(row).get(column);
	}
	/**
	 * Gets an entire row
	 */
	public ArrayList<Integer> getRow(int index) {
		return matrix.get(index);
	}
	/**
	 * Gets an entire column
	 */
	public ArrayList<Integer> getColumn(int index) {
		ArrayList<Integer> column = new ArrayList<Integer>();
		for(ArrayList<Integer> row : matrix) {
			column.add(row.get(index));
		}
		return column;
	}
	/**
	 * To string overrided func.
	 * @return 
	 */
	@Override
	public String toString() {
		String out = "";
		for(ArrayList<Integer> row : matrix) {
			System.out.println(row.toString()
					.replaceFirst("\\[", "")
					.replaceFirst("\\]", ""));
		}
		return out;
	}
}
