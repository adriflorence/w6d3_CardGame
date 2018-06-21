import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
//    private

    public Game(ArrayList<Player> players, Deck deck) {
        this.players = players;
        this.deck = deck;
    }


    public void sortPlayers(){
        ArrayList<Player> playerRanking = new ArrayList<Player>();

        while(players.size() > 0){
            Player tempMax = players.get(0);
            for(Player player : players) { // returns highest handValue player
                if (player.getHandValue() > tempMax.getHandValue()) {
                    tempMax = player;
                }
            }
            playerRanking.add(tempMax);
            players.remove(tempMax);
        }
        players = playerRanking;
    }

    public Player winner(){
        return players.get(0);
    }

    public void play(){
        deck.populateDeck();
        deck.shuffle();
        for (Player player : players) {
            deck.dealCard(player);
        }
        sortPlayers();
    }
}
