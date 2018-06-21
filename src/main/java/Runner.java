import java.util.ArrayList;

public class Runner {

    // look up STATIC methods
    public static void main(String[] args) {
        Menu menu = new Menu();
        ArrayList<Player> players = menu.askForPlayer();

        Deck deck = new Deck();
        Game game = new Game(players, deck);
        game.play();
        Player winner = game.winner();
        System.out.println(winner.getName() + " wins with " + winner.getHandValue() + " points");
    }

}