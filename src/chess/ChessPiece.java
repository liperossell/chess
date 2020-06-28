package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

/**
 * Peca de Xadrez
 * @author Filipe
 *
 */
public abstract class ChessPiece extends Piece {
	
	private final Color color; // Cor da peca de xadrez

	/**
	 * Cria uma peca de xadrez, informando o tabuleiro e a cor.
	 * 
	 * @param Tabuleiro
	 * @param Cor
	 */
	public ChessPiece(final Board board, final Color color) {
		super(board);
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}

	protected boolean isThereOpponentPiece(Position position){
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p!= null && p.getColor() != color;
	}
	
}
