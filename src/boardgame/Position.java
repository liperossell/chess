package boardgame;

/**
 * Posicao
 * @author Filipe
 *
 */
public class Position {
	private int row; //Linha
	private int column; //COluna
	
	/**
	 * Cria uma posicao, informando linha e coluna
	 * @param row
	 * @param column
	 */
	public Position(final int row, final int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(final int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(final int column) {
		this.column = column;
	}
	
	public void setValues(final int row, final int column){
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
