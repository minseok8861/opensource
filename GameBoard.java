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
        int index = 0;
        for (int i = 0; i < 4; i++) 
            for (int j = 0; j < 4; j++) {
                square[i][j] = cells[index];
                index += 1;
            }
    }

    private Cell[] createTwinCells(Color[] cs) {
        Cell[] twins = new Cell[cs.length*2];
        int i = 0; 
        for (int k = 0; k < cs.length; k++) {
            twins[i] = new Cell(cs[k]);
            i += 1;
            twins[i] = new Cell(cs[k]);
            i += 1;
        }
        return twins;
    }

    private Cell[] shuffle(Cell[] twins) {
        int index;
        Cell temp;
        Random random = new Random();
        for (int i = twins.length - 1; i > 0; i--) {
            index = random.nextInt(i+1);
            temp = twins[index];
            twins[index] = twins[i];
            twins[i] = temp;
        }
        return twins;
    }
}
