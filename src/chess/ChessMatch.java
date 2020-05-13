package chess;

import boardgame.Board;

/**
 * Partida de Xadrez
 * @author filipe
 *
 */
public class ChessMatch {
	
	private Board board; //Tabuleiro
	
	/**
	 * Cria um tabuleiro (8x8)
	 */
	public ChessMatch() {
		this.board = new Board(8,8);
	}
	
	/**
	 * 
	 * @return Matriz contendo pecas de xadrez da partida
	 */
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
