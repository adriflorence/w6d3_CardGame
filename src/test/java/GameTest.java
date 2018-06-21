import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertNotNull;

public class GameTest {

    Deck deck;
    Game game;
    Player player1, player2;
    ArrayList<Player> players;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
        player1 = new Player("Joe");
        player2 = new Player("Adri");

        deck.dealCard(player1);
        deck.dealCard(player2);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        game = new Game(players, deck);
        game.play();
    }

    @Test
    public void isThereAWinner(){
        assertNotNull(game.winner());
    }

}
