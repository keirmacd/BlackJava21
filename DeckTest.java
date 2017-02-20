import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class DeckTest{

Deck deck;
Hand hand;
Card card;
Player player;

@Before
public void before(){
  deck = new Deck();
  hand = new Hand();
  card = new Card(2, "hearts");
  player = new Player("Ally");
}

@Test
public void deckhascards(){
assertEquals(52, deck.getCards().size());
}
@Test
public void handHasCard(){
hand.takeCard(card);
  assertEquals(1, hand.getCards().size());
}
@Test 
public void playerhandhascard(){
  player.takeCard(card);
  assertEquals(1, player.getHand().getCards().size());
}
}