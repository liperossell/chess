package boardgame;

/**
 * Tabuleiro
 * @author Filipe
 *
 */
public class Board {
	
	private int rows; //linhas do tabuleiro
	private int columns; //colunas do tabuleiro
	private final Piece[][] pieces; // pecas do tabuleiro

	/**
	 * Construtor que recebe uma quantidade de linhas e colunas Cria uma matriz de
	 * pecas no tabuleiro com base na quantidade de linhas e colunas
	 * 
	 * @param Linha
	 * @param Coluna
	 */
	public Board(final int rows, final int columns) {
		if (rows < 1  || columns < 1) {
			throw new BoardException("Error creating the board: there must be at least 1 column and 1 row.");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	/**
	 * 
	 * @return quantidade de linhas
	 */
	public int getRows() {
		return rows;
	}

	// Getters e Setters

	public int getColumns() {
		return columns;
	}

	// Fim Getters e Setters

	/**
	 * Retorna a peca do tabuleiro em uma posicao
	 * 
	 * @param Posicao no tabuleiro
	 * @return Peca do tabuleiro
	 */
	public Piece piece(final Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not in the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	/**
	 * Retorna a peca do tabuleiro em uma dada linha e coluna
	 * @param row LinhaO
	 * @param Column Coluna
	 * @return Peca do tabuleiro
	 */
	public Piece piece(final int row, final int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not in the board.");
		}
		return pieces[row][column];
	}

	/**
	 * Coloca uma peca na matriz de pecas
	 * 
	 * @param piece
	 * @param position
	 */
	public void placePiece(final Piece piece, final Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position: " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		if (!positionExists(position)){
			throw new BoardException("Position not in the board");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}

	private boolean positionExists(int row, int column) {
		return (row >= 0 && row < rows && column >= 0 && column < columns);
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not in the board");
		}
		return (piece(position) != null);
	}
}
