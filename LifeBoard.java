public class LifeBoard {
	
	int cols, rows;
	boolean rutan[][];
	int gen;

	/** Skapar en spelplan med rows rader och cols kolonner. Spelplanen är från
	    början tom, dvs alla rutorna är tomma och generationsnumret är 1. */	
	public LifeBoard(int rows, int cols) {
		this.rows= rows;
		this.cols= cols;
		rutan= new boolean [rows][cols];
		gen = 1;
	}

	/** Ger true om det finns en individ i rutan med index row, col, false annars. 
	    Om index row, col är utanför spelplanen returneras false */
	public boolean get(int row, int col) {
		//kolla om (00, 01, 02) inte är störra än själva ruta nummret
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

	/** Lagrar värdet val i rutan med index row, col */
	public void put(int row, int col, boolean val) {
		rutan[row][col]= val;
	}

	/** Tar reda på antalet rader */
	public int getRows() {
		return rows;
	}

 	/** Tar reda på antalet kolonner */
	public int getCols() {
		return cols;
	}

	/** Tar reda på aktuellt generationsnummer */
	public int getGeneration() {
		return gen;
	}

	/** Ökar generationsnumret med ett */
	public void increaseGeneration() {
		gen+=1;
	}
}