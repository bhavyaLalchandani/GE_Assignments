import java.util.Random;

public class DeckOfCards {
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

        String[][] players = new String[4][9];
        distribute(deck, players);

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards: ");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
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

    private static void distribute(String[] deck, String[][] players) {
        int index = 0;
        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < players[i].length; j++) {
                players[i][j] = deck[index++];
            }
        }
    }
}
