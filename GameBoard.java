import java.awt.Color;
import java.util.Random;
public class GameBoard {
    
    private Cell[][] square;
    private int point;
    
    public Cell[][] square() { 
        return square; 
    }
    
    public int point() { 
        return point; 
    }
    
    public void upgrade() { 
        
        point += 2; 
    }
    public GameBoard(){
        square = new Cell[4][4];
        Color[] colors = {Color.BLUE, Color.CYAN, Color.PINK, Color.RED, 
                          Color.GRAY, Color.GREEN, Color.MAGENTA, Color.ORANGE};
        Cell[] twins = createTwinCells(colors);
        makeSquare(shuffle(twins));
    }
    private void makeSquare(Cell[] cells) {
    }
    private Cell[] createTwinCells(Color[] cs) {
        return twins;
    }
    private Cell[] shuffle(Cell[] twins) {
        return twins;
    }
}
