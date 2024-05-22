package models;

import java.util.ArrayList;

public class Dealer {

  private int score;

  private ArrayList<Integer> hand = new ArrayList<>();

  public int getInitialHand() {

    Die d1 = new Die();

    int dieValue = d1.roll();

    this.hand.add(dieValue);

    return dieValue;
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

  public void play(String playerOrDealer) {

    while (score < 16) {
      System.out.println(playerOrDealer + " hits.");
    }
  }

  public void hit() {
    Die d1 = new Die();

    int r1 = d1.roll();

    hand.add(r1);

    score = scoreHand(hand);

    announceScore();
  }

  public void announceRoll(int die) {

    System.out.println("A " + die + " was rolled.");

    switch (die) {
      case 1:
        System.out.println(
                "\n" +
                "________" + "\n" +
                "|       |" + "\n" +
                "|   .   |" + "\n" +
                "|_______|" + "\n");

      case 2:
        System.out.println(
                "\n" +
                "________" + "\n" +
                "|   .   |" + "\n" +
                "|   .   |" + "\n" +
                "|_______|" + "\n");
      case 3:
        System.out.println(
                "\n" +
                "_______" + "\n" +
                "|   .  |" + "\n" +
                "|  . . |" + "\n" +
                "|______|" + "\n");
      case 4:
        System.out.println(
                "\n" +
                "_______" + "\n" +
                "|  . . |" + "\n" +
                "|  . . |" + "\n" +
                "|______|" + "\n");
      case 5:
        System.out.println(
                "\n" +
                "_______" + "\n" +
                "|  . . |" + "\n" +
                "| . . .|" + "\n" +
                "|______|" + "\n");
      case 6:
        System.out.println(
                "\n" +
                "_______" + "\n" +
                "| . . .|" + "\n" +
                "| . . .|" + "\n" +
                "|______|" + "\n");

    }
  }

}
