package ku.cs.modules;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Die> dice;
    private Board board;
    private Piece piece;

    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
        piece = new Piece();
        piece.setLocation(board.getSquare("Square 0"));
    }


    public void takeTurn(){
        int total = 0;
        for (Die die : dice) {
            die.roll();
            total += die.getFaceValue();
        }
        System.out.println(name + " have rolled " + total + ".");
        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation.getName(), total);
        piece.setLocation(newLocation);
        System.out.println(name + " is moving from " + oldLocation.getName() + " to " + newLocation.getName() + ".\n");
    }

    public void setDice(ArrayList<Die> dice) {
        this.dice = dice;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public String getName() {
        return name;
    }
}

/**
 * 6510450216 Khanisorn Srisawang
 */