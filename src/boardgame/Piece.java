package boardgame;

/**
 * Peca
 * @author Filipe
 *
 */
public class Piece {
	
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
	
}
