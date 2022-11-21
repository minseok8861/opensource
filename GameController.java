package Opensource;

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
        
    }
    
    private void delay(int how_long) { 
        try { Thread.sleep(how_long); }
        catch (InterruptedException e) { }
    }

}
