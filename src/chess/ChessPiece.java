package chess;

import boardgame.Board;
import boardgame.Piece;

/**
 * Peca de Xadrez
 * @author Filipe
 *
 */
public class ChessPiece extends Piece {
	
	private Color color; //Cor da peca de xadrez
	
	/**
	 * Cria uma peca de xadrez, informando o tabuleiro e a cor.
	 * @param Tabuleiro
	 * @param ENUM: Cor
	 */
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}
	
}
