package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

/**
 * Partida de Xadrez
 * @author filipe
 *
 */
public class ChessMatch {
	
	private final Board board; // Tabuleiro

	/**
	 * Cria um tabuleiro (8x8)
	 */
	public ChessMatch() {
		this.board = new Board(8, 8);
		initialSetup();
	}

	/**
	 * 
	 * @return Matriz contendo pecas de xadrez da partida
	 */
	public ChessPiece[][] getPieces() {
		final ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

	/**
	 * Configuracao inicial da partida de Xadrez
	 */
	private void initialSetup(){
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
		board.placePiece(new King(board, Color.WHITE), new Position(2,1));
	}
}
