<<<<<<< HEAD
package MatchingGame;

=======
<<<<<<< HEAD
=======
package Opensource;

import MatchingGame.BoardWriter;
import MatchingGame.GameBoard;
import MatchingGame.GameController;
import MatchingGame.Reader;

>>>>>>> 6f83ddbb6c981f96cbeac1508cc2c69f5e4e47c2
>>>>>>> 7a02ccd3cbca112d16d8a78a894f7b0e3b5b221e
public class MatchingGame {

    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        BoardWriter writer = new BoardWriter(board);
        Reader reader = new Reader();
        new GameController(board,writer,reader).play();
    }

}