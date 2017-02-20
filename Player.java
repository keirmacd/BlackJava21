public class Player{

private String name;
private Hand hand;


  public Player(String name) {
    this.name = name;
    this.hand = new Hand();
  }
  public void takeCard(Card card){
    hand.takeCard(card);
  }
  public Hand getHand(){
  return this.hand; 
}
}
