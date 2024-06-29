package ku.cs.modules;

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;

    public Board(int size){
        squares = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            squares.add(new Square("Square " + i));
        }
    }

    public Square getSquare(String name, int move) {
        int index = squares.indexOf(new Square(name));
        return squares.get((index + move) % squares.size());
    }

    public Square getSquare(String name) {
        return squares.get(squares.indexOf(new Square(name)));
    }

}

/**
 * 6510450216 Khanisorn Srisawang
 */