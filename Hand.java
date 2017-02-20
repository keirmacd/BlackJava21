import java.util.ArrayList;
public class Hand{

private ArrayList<Card> cards;

public Hand(){
cards = new ArrayList<Card>();

}

public void takeCard(Card card){
  cards.add(card);
}
public ArrayList getCards(){
  return this.cards;
}
}