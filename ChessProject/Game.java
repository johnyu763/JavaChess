
public class Game {
	char[][] board = new char[10][10];
	public Game(String player1, String player2) {
		String name1 = player1;
		String name2 = player2;
		setBoard();
	}
	
	private void setBoard() {
		char[] pieceOrder = {'R','N','B','Q','K','B','N','R'};
		char letterCoordinate = 'a';
		char numCoordinate = '1';
		for(int i=1;i<9;i++) {
			board[0][i] = letterCoordinate;
			board[1][i] = pieceOrder[i-1];
			board[2][i] = 'P';
			board[9][i] = letterCoordinate;
			board[8][i] = pieceOrder[i-1];
			board[7][i] = 'P';
			board[i][0] = numCoordinate;
			board[i][9] = numCoordinate;
			letterCoordinate++;
			numCoordinate++;
			
		}
	}
	
	public void printBoard() {
		for(int k=0;k<10;k++) {
			for(int l=0;l<10;l++)
				System.out.print(board[k][l]+" ");
			System.out.println();
		}
	}
	
	
}
