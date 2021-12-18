public class Life {

	LifeBoard board;
	LifeView view;
	
	public Life(LifeBoard board) {
		this.board= board;
	}
	
	public void flip(int row, int col) {
		
		if(board.get(row, col) ) {
			
			board.put(row, col, false);
		}
		else {
			board.put(row, col, true);
		}
		
	}
	
	private int getNeighbours( int row, int col) {
		int counter=0;

		for(int i=row-1; i<=row+1; i++) {
			for(int j=col-1; j<=col+1; j++) {
				 if(board.get(i, j) && !(i==row && j==col)) {
					counter ++;
				}
				
			}
			
		}
		return counter;

		
		
	}
	
	public void newGeneration() {
		board.increaseGeneration();
		boolean hjälp [][] = new boolean[board.getRows()][board.getCols()];

		for(int i= 0; i<board.getRows(); i++) {
			for(int j=0; j<board.getCols(); j++) {
				if(board.get(i, j) && getNeighbours(i, j)==2 || getNeighbours(i, j)==3 ) {
					hjälp[i][j]= true;
				}
//				else if(board.rutan[i][j] == true && getNeighbours(i, j)==3 ) {
//					hjälp[i][j]= true;
//				}
				else if (board.rutan[i][j]== true && (getNeighbours(i,j) >=4 || getNeighbours(i,j)<=1) ) {
					hjälp[i][j]= false;
				}
				else {
					hjälp[i][j] = board.rutan[i][j];
				}
			}
			
		}
		
		board.rutan = hjälp;
	}
	

	
	
}
