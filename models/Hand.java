package models;

import java.util.ArrayList;


public class Hand {
  private ArrayList<Integer> dice = new ArrayList<>();
  private int score = 0;


  public ArrayList<Integer> add(int die) {

    dice.add(die);

    return new ArrayList<>(dice);
  }

  private int calculateScore() {

    for (int dieVal : dice) {
      this.score += dieVal;
    }

    return this.score;
  }

  public int getScore() {

    this.score = this.calculateScore();
    return this.score;
  }

  public void announceScore() {
    this.getScore();
    System.out.println("score: " + this.score);
  }

}
