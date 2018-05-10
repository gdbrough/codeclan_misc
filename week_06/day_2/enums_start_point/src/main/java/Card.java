public class Card {

//    private String suit;
    private SuitType suit;
    private ValueType value;

//    public Card(String suit) {
    public Card(SuitType suit, ValueType value) {
        this.suit = suit;
        this.value = value;
    }

//    public String getSuit(){
    public SuitType getSuit(){
        return this.suit;
    }

    public int getValueFromEnum(){
        return this.value.getValue();
    }

}