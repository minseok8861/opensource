package Opensource;

<<<<<<< HEAD
import MatchingGame.BoardWriter;
import MatchingGame.GameBoard;
import MatchingGame.GameController;
import MatchingGame.Reader;

public class MatchingGame {

    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        BoardWriter writer = new BoardWriter(board);
        Reader reader = new Reader();
        new GameController(board,writer,reader).play();
    }

}
=======
public class MatchingGame {

    public static void main(String[] args) {
    }
}
>>>>>>> 847af0b3ff279ac496873b2eefb521b3c26d5a2f
