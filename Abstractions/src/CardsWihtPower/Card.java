package CardsWihtPower;

public class Card {
    private String cardName;
    private  int cardPower;

    public Card(int cardPower, String cardName) {
        this.cardPower = cardPower;
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }

    public int getCardPower() {
        return cardPower;
    }

    @Override
    public String toString() {
       return String.format("CardsWihtPower.Card name: %s; CardsWihtPower.Card power: %d",cardName,cardPower);
    }
}
