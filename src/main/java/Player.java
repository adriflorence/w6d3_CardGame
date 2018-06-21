import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;
    private int handValue;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.handValue = 0;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public int getHandSize() {
        return this.hand.size();
    }

    public int getHandValue() {
        return handValue;
    }

    public void getCardFromDeck(Card card){
        this.hand.add(card);
        this.handValue += card.getValueFromEnum(); // update handValue
    }

}
