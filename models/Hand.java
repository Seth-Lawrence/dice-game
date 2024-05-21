package models;
import java.util.ArrayList;

public class Hand {

  private ArrayList<Die> hand = new ArrayList<>();
  private int score;

  public ArrayList<Die> addDie(Die die) {

    hand.add(die);

    return hand;
  }

  public int calculateScore(int[] dice) {

    for (int i : dice) {
      this.score += i;
    }

    return score;
  }
}
