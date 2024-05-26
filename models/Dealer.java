package models;

public class Dealer {
  Hand hand = new Hand();

  public int getInitialHand() {

    Die d1 = new Die();

    int dieValue = d1.roll();

    this.hand.add(dieValue);

    return dieValue;
  }

  public void play() {
    while (hand.getScore() < 12) {
      hit();
    }
  }

  public void hit() {
    Die d1 = new Die();

    int r1 = d1.roll();

    hand.add(r1);
    hand.announceScore();
  }
}
