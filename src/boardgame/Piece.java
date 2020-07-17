package boardgame;

/**
 * Peca
 * @author Filipe
 *
 */
public abstract class Piece {
	
	protected Position position; //posicao (linha e coluna) da peca.
	private final Board board; // Tabuleiro qual pertence

	/**
	 * Cria uma nova peca, informando um tabuleiro
	 * 
	 * @param Tabuleiro
	 */
	public Piece(final Board board) {
		this.board = board;
	}
	
	/**
	 * 
	 * @return Tabuleiro da peca
	 */
	protected Board getBoard() {
		return this.board;
	}
	/**
	 * Possiveis movimentos
	 * @return Matriz com os possiveis movimentos da peca
	 */
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove(){
		boolean[][] mat = possibleMoves();
		for (int i = 0; i< mat.length; i++) {
			for (int j = 0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}			
		}
		return false;
	}
}
