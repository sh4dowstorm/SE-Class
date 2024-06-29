package ku.cs.modules;

import java.util.ArrayList;
import java.util.List;

public class MonopolyGame {
    private int roundCount = 1;
    private ArrayList<Player> players;

    public MonopolyGame(ArrayList<Player> players, Board board, ArrayList<Die> dice) {
        this.players = players;
        for (Player player : players) {
            player.setBoard(board);
            player.setDice(dice);
        }
    }

    private void playRound() {
        for (Player player : players) {
            System.out.println(player.getName() + " is taking turn.");
            player.takeTurn();
        }
    }

    public void playGame(int roundNum) {
        while (roundCount <= roundNum) {
            System.out.println("Round " + roundCount + " is starting.\n");
            playRound();
            System.out.println("Round " + roundCount + " is finished.\n");
            roundCount++;
        }
    }
}

/**
 * 6510450216 Khanisorn Srisawang
 */