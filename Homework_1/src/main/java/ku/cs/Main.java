package ku.cs;

import ku.cs.modules.Board;
import ku.cs.modules.Die;
import ku.cs.modules.MonopolyGame;
import ku.cs.modules.Player;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int NUM_PLAYERS = 4;
        final int NUM_DICE = 2;
        Board board = new Board(40);

        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i < NUM_PLAYERS; i++) {
            players.add(new Player("Player" + (i + 1), board));
        }

        ArrayList<Die> dice = new ArrayList<Die>();
        for (int i = 0; i < NUM_DICE; i++) {
            dice.add(new Die());
        }

        MonopolyGame game = new MonopolyGame(players, board, dice);

        game.playGame(10);

    }
}

// 6510450216 Khanisorn Srisawang
