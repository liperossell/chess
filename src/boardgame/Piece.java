package boardgame;

public class Piece {
	
	protected Position position; //posicao (linha e coluna) da peca.
	private Board board; //Tabuleiro qual pertence

	//Construtor da peca, recebe um tabuleiro
	public Piece(Board board) {
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
