public class LifeBoard {
	
	int cols, rows;
	boolean rutan[][];
	int gen;

	/** Skapar en spelplan med rows rader och cols kolonner. Spelplanen �r fr�n
	    b�rjan tom, dvs alla rutorna �r tomma och generationsnumret �r 1. */	
	public LifeBoard(int rows, int cols) {
		this.rows= rows;
		this.cols= cols;
		rutan= new boolean [rows][cols];
		gen = 1;
	}

	/** Ger true om det finns en individ i rutan med index row, col, false annars. 
	    Om index row, col �r utanf�r spelplanen returneras false */
	public boolean get(int row, int col) {
		//kolla om (00, 01, 02) inte �r st�rra �n sj�lva ruta nummret
		if(row>=rows || col>=cols || row<0 || col<0) {
			return false;
		}
		else if(rutan[row][col]== true) {
			return true;
		}
		else {
			return false;
		}
	}

	/** Lagrar v�rdet val i rutan med index row, col */
	public void put(int row, int col, boolean val) {
		rutan[row][col]= val;
	}

	/** Tar reda p� antalet rader */
	public int getRows() {
		return rows;
	}

 	/** Tar reda p� antalet kolonner */
	public int getCols() {
		return cols;
	}

	/** Tar reda p� aktuellt generationsnummer */
	public int getGeneration() {
		return gen;
	}

	/** �kar generationsnumret med ett */
	public void increaseGeneration() {
		gen+=1;
	}
}