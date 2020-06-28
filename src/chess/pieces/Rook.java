package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 * Classe Torre, herda Peca de Xadrez
 * @author Filipe
 */
public class Rook extends ChessPiece {

    public Rook(final Board board, final Color color) {
        super(board, color);
    }
    
    @Override
    public String toString() {
        return "R";
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}