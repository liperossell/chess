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
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
