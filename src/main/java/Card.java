import javax.swing.*;

public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType suit() {
        return this.suit;
    }

    public RankType rank() {
        return this.rank;
    }

}
