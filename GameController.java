<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
package Opensource;

>>>>>>> 6f83ddbb6c981f96cbeac1508cc2c69f5e4e47c2
>>>>>>> 7a02ccd3cbca112d16d8a78a894f7b0e3b5b221e
public class GameController {
    
    private GameBoard board;
    private BoardWriter writer;
    private Reader reader;
    
    public GameController(GameBoard b, BoardWriter w, Reader r) {
        board = b;
        writer = w;
        reader = r;
    }
    
    public void play() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7a02ccd3cbca112d16d8a78a894f7b0e3b5b221e
        Cell[][] square = board.square();
        int opened_cell = 16;
        while(opened_cell != 0) {
        	int cell1 = reader.readInput();
        	cell1--;
        	int row1 = cell1/4;
        	int col1 = cell1%4;
        	square[row1][col1].reveal();
        	writer.repaint();
        	int cell2 = reader.readInput();
        	while (cell2 == cell1)
        		cell2 = reader.readInput();
        	cell2--;
        	int row2 = cell2/4;
        	int col2 = cell2%4;
        	square[row2][col2].reveal();
        	writer.repaint();
        	delay(2000);
        	if(square[row1][col1].color() == square[row2][col2].color())
        		opened_cell -= 2;
        	else {
        		square[row1][col1].hide();
        		square[row2][col2].hide();
        		writer.repaint();
        	}
        }
    }
    
    /** delay - how_long millisecond 동안 실행 정지  */
<<<<<<< HEAD
=======
=======
        
    }
    
>>>>>>> 6f83ddbb6c981f96cbeac1508cc2c69f5e4e47c2
>>>>>>> 7a02ccd3cbca112d16d8a78a894f7b0e3b5b221e
    private void delay(int how_long) { 
        try { Thread.sleep(how_long); }
        catch (InterruptedException e) { }
    }

}
