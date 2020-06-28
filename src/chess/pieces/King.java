package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 * Classe Rei, herda peca de Xadrez
 * @author Filipe
 */
public class King extends ChessPiece {

    public King(final Board board, final Color color) {
        super(board, color);
        
    }
    
    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}