import java.util.ArrayList;
import java.util.Collections;



public class Deck{

private ArrayList<Card> cards;
private Card card;

  public Deck(){
   int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
   String[] suits = {"hearts", "diamonds", "spades", "clubs"};
   cards = new ArrayList<Card>();
   for (String suit : suits){
    for (int value : values){
      card = new Card(value, suit);
      cards.add(card);
    }
   }
   }
public ArrayList<Card> getCards(){
return this.cards;
}


}
