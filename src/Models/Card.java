package Models;

public class Card {
    private int number;
    private String letter;

    public Card(int number, String letter){
        this.number = number;
        this.letter = letter;
    }

    public void showCard(){
        System.out.println(this.number + this.letter);
    }
}
