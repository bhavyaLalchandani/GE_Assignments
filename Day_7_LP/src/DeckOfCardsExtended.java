import java.util.LinkedList;
import java.util.Random;

class Player {
    String name;
    LinkedList<String> deck = new LinkedList<>();

    public Player(String name) {
        this.name = name;
    }

    public void addCard(String card) {
        deck.add(card);
    }

    public void printDeck() {
        System.out.println(name + "'s Cards: " + deck);
    }
}

public class DeckOfCardsExtended {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[52];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        shuffle(deck);

        LinkedList<Player> players = new LinkedList<>();
        players.add(new Player("Player 1"));
        players.add(new Player("Player 2"));
        players.add(new Player("Player 3"));
        players.add(new Player("Player 4"));

        distribute(deck, players);

        for (Player player : players) {
            player.printDeck();
        }
    }

    private static void shuffle(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = rand.nextInt(deck.length);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    private static void distribute(String[] deck, LinkedList<Player> players) {
        int index = 0;
        for (Player player : players) {
            for (int j = 0; j < 9; j++) {
                player.addCard(deck[index++]);
            }
        }
    }
}

