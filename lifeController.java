
public class lifeController {

	public static void main(String[] args) {
		LifeBoard lb=  new LifeBoard(20, 20);
		LifeView lv= new LifeView(lb);
		Life L = new Life(lb);
		lv.drawBoard();
		
		
		while(true) {
//			int check;
//			switch(check) {
//			
			int check = lv.getCommand();

//			case 1:
			if(check ==1) {
				L.flip(lv.getRow(), lv.getCol());
				lv.update();
//				break;
			}	
//			case 2: 
			else if(check==2) {
				L.newGeneration();
				lv.update();
//				break;
			}
//			case 3: 
			else if	(check ==3) {
				
				System.exit(0);
//				break;
			}

			}

//		}
	}
}

