package Models;

import java.util.*;

public class Deck {

    private List<Card> card;
    private final String[] names = {"clubs", "Diamonds", "Hearts", "Spades"};

    public Deck(){
        card = new ArrayList<Card>();
        build();
    }

    private void build(){
        for(int i = 0; i < 13; i++){
            for(String name : names){
                card.add(new Card(i,name));
            }
        }
    }

    public void showDeck(){
        for(Card cardElement : card ){
            cardElement.showCard();
        }
    }

}
