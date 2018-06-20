import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    Deck deck;
    Player player1;


    @Before
    public void setUp() throws Exception {
        deck = new Deck();
        deck.populateDeck();
        player1 = new Player("Joe");
    }

    @Test
    public void getCardFromDeckWorks() {
        deck.dealCard(player1);
        assertEquals(1, player1.getHandSize());
    }

    @Test
    public void testHandValueIsInRange() {
        deck.dealCard(player1);
        deck.dealCard(player1);
        int cardValue = player1.getHandValue();
        assertTrue(1 <= cardValue && cardValue <= 20);
    }
}