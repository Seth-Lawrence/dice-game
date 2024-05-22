package models;

import java.util.ArrayList;

public class Hand {

  private ArrayList<Integer> dice = new ArrayList<>();

  private int score = 0;

  public ArrayList<Integer> add(int die) {

    dice.add(die);

    return dice;
  }

  public int calculateScore(int[] dice) {

    for (int i : dice) {
      this.score += i;
    }

    return score;
  }

  public String getScore() {

    String playerScore = Integer.toString(this.score);

    return playerScore;
  }

  public void announceRoll(int die) {

    switch (die) {
      case 1:
        System.out.println(
            "\n" +
                "________" + "\n" +
                "|       |" + "\n" +
                "|   .   |" + "\n" +
                "|_______|" + "\n");
        break;

      case 2:
        System.out.println(
            "\n" +
                "________" + "\n" +
                "|   .   |" + "\n" +
                "|   .   |" + "\n" +
                "|_______|" + "\n");
        break;
      case 3:
        System.out.println(
            "\n" +
                "_______" + "\n" +
                "|   .  |" + "\n" +
                "|  . . |" + "\n" +
                "|______|" + "\n");
        break;
      case 4:
        System.out.println(
            "\n" +
                "_______" + "\n" +
                "|  . . |" + "\n" +
                "|  . . |" + "\n" +
                "|______|" + "\n");
        break;
      case 5:
        System.out.println(
            "\n" +
                "_______" + "\n" +
                "|  . . |" + "\n" +
                "| . . .|" + "\n" +
                "|______|" + "\n");
        break;
      case 6:
        System.out.println(
            "\n" +
                "_______" + "\n" +
                "| . . .|" + "\n" +
                "| . . .|" + "\n" +
                "|______|" + "\n");
        break;
    }

    System.out.println("A " + die + " was rolled.");
  }
}
