public class Card {

    private SuitsType suit;
    private RankType rank;

    public Card(SuitsType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public SuitsType getSuit(){
        return this.suit;
    }

    public RankType getRank() {
        return this.rank;
    }

    public int getValueFromEnum(){
        return this.rank.getValue();
    }

    public String niceName(){
        return this.rank.getName() + " of " + this.suit;
    }

}