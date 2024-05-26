package models;
import java.util.ArrayList;

public class Hand {
  private ArrayList<Integer> dice = new ArrayList<>();
  private int score = 0;




  public int add() {
    Die d1 = new Die();

    int roll = d1.roll();
    dice.add(roll);
    calculateScore();

    return roll;
  }

  private void calculateScore() {
    for (int dieVal : dice) {
      this.score += dieVal;
    }
  }

  public int getScore() {
    return this.score;
  }

  public void announceScore() {
    System.out.println("score: " + this.score);
  }

}
