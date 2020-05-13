package application;

import chess.ChessPiece;

/**
 * User Interface
 * @author Filipe
 *
 */
public class UI {

	/**
	 * Imprime o tabuleiro em branco
	 * @param Matriz contendo pecas de xadrez
	 */
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print(8 - i + " ");
			for (int j = 0; j < pieces[i].length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	/**
	 * Metodo auxiliar para imprimir uma peca ou um espaco em branco (-)
	 * @param Peca para imprimir
	 */
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else
		{
			System.out.println(piece);
		}
		System.out.print(" ");
	}
}
