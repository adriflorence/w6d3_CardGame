import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public ArrayList<Player> askForPlayer() {
        ArrayList<Player> players = new ArrayList<>();

        System.out.println("How many players are playing? ");
        Scanner sc_num = new Scanner(System.in);
        int numberOfPlayers = sc_num.nextInt();
        for (int i=1; i < numberOfPlayers+1; i++) {
            System.out.println("Name of player " + i + "?");
            Scanner sc_name = new Scanner(System.in);
            Player player = new Player(sc_name.nextLine());
            players.add(player);
        }
        return players;
    }
}
