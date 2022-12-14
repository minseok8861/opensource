import javax.swing.*;
import java.time.*;

public class GameController {
    
    private GameBoard board;
    private BoardWriter writer;
    private Reader reader;
    private String name;

    public GameController() {
    	name = JOptionPane.showInputDialog(null,"이름을 입력하세요.");
        board = new GameBoard();
        writer = new BoardWriter(board,name);
        reader = new Reader();
    }
    
    public void play() {
    	Instant stime = Instant.now();
        Cell[][] square = board.square();
        int opened_cell = 16;
        while(opened_cell != 0) {
        	int cell1 = reader.readInput();
        	while(square[(cell1-1)/4][(cell1-1)%4].revealed() == true)
        		cell1 = reader.readInput();
        	cell1--;
        	int row1 = cell1/4;
        	int col1 = cell1%4;
        	square[row1][col1].reveal();
        	writer.repaint();
        	int cell2 = reader.readInput();
        	while (cell2-1 == cell1 || square[(cell2-1)/4][(cell2-1)%4].revealed() == true)
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
        Instant etime = Instant.now();
        JOptionPane.showMessageDialog(null,"플레이어 : " + name + "\n소요시간:"+(Duration.between(stime, etime).toMillis())/ 1000+"초");
    }
    
    /** delay - how_long millisecond 동안 실행 정지  */

    
    private void delay(int how_long) { 
        try { Thread.sleep(how_long); }
        catch (InterruptedException e) { }
    }

}
