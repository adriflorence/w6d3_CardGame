import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Card card;
    Deck deck;
    Player player1;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
        deck.populateDeck();
        player1 = new Player("Joe");
    }

    @Test
    public void deckIsPopulated() {
        assertEquals(52, deck.getDeckSize());
    }

    @Test
    public void dealCardWorks() {
        deck.dealCard(player1);
        assertEquals(51, deck.getDeckSize());
        assertEquals(1, player1.getHandSize());
    }


}
