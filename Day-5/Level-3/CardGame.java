import java.util.Arrays;

public class CardGame {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        // Initialize the deck with "rank of suit"
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the deck of n cards to x players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n % x != 0) {
            System.out.println("The number of cards cannot be evenly distributed among the players.");
            return new String[0][0];
        }

        String[][] players = new String[x][n / x];

        // Distribute cards to players
        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n / x; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersAndCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        // Initialize the deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Number of cards to distribute and number of players
        int n = 52;  // Total number of cards in the deck
        int x = 4;   // Number of players

        // Distribute cards to players
        String[][] players = distributeCards(deck, n, x);

        // Print players and their cards
        if (players.length > 0) {
            printPlayersAndCards(players);
        }
    }
}
