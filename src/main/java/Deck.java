import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int getDeckSize() {
        return cards.size();
    }

    public void populateDeck(){
        for (SuitsType suit : SuitsType.values()) {
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public void dealCard(Player player) {
        Card card1 = cards.remove(0);
        player.getCardFromDeck(card1);
        Card card2 = cards.remove(0);
        player.getCardFromDeck(card2);
    }
}
