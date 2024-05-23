package models;

import java.util.ArrayList;


public class Hand {
  private ArrayList<Integer> dice = new ArrayList<>();
  private int score = 0;

  public ArrayList<Integer> add(int die) {

    dice.add(die);

    return new ArrayList<>(dice);
  }

  public int calculateScore(int[] dice) {

    for (int i : dice) {
      this.score += i;
    }

    return score;
  }

  public int getScore() {

    return this.score;
  }

}
