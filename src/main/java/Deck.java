import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;


    public Deck() {
        this.cards = new ArrayList<>();
    }
    public int getCount(){
        return this.cards.size();
    }
}
