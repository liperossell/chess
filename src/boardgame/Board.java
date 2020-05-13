package boardgame;

public class Board {
	
	private int rows; //linhas do tabuleiro
	private int columns; //colunas do tabuleiro
	private Piece[][] pieces; //pecas do tabuleiro
	
	/*
	 * Construtor que recebe uma quantidade de linhas e colunas
	 * Cria uma matriz de pecas no tabuleiro com base na quantidade de linhas e colunas
	 */
	public Board(int rows, int columns) {
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

	//Getters e Setters
	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}	
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	//Fim Getters e Setters
	
	/**
	 * Retorna a peca do tabuleiro em uma posicao
	 * @param Posicao no tabuleiro
	 * @return Peca do tabuleiro
	 */
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
}
