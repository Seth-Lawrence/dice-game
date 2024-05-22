package models;

import java.util.ArrayList;

public class Dealer {

  Hand hand = new Hand();

  public int getInitialHand() {

    Die d1 = new Die();

    int dieValue = d1.roll();

    this.hand.add(dieValue);

    return dieValue;
  }

  public void play() {
    while (hand.score < 14) {
      hit();
    }
  }

  public void hit() {
    Die d1 = new Die();

    int r1 = d1.roll();

    hand.add(r1);

    this.score = scoreHand(hand);
    announceScore();
  }


  public int scoreHand(ArrayList<Integer> dice) {
    for (int die : dice) {
      score += die;
    }

    return score;
  }

  public void announceScore() {
    System.out.println("Dealer's score is" + this.score);
  }
}
