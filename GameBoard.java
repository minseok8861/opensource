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

    }

}
