package models;

public class Die {

  private int roll = 0;

  public int roll() {
    double roll = ((double) (Math.random() * 6) + 1);

    this.roll = (int) roll;

    return this.roll;
  }

  public void stateRoll() {

    int die = this.roll;

    switch (die) {
      case 1:
        System.out.println(
            "\n" +
                " _____" + "\n" +
                "|     |" + "\n" +
                "|  *  |" + "\n" +
                "|_____|" + "\n");
        break;

      case 2:
        System.out.println(
            "\n" +
                " _____" + "\n" +
                "|     |" + "\n" +
                "| * * |" + "\n" +
                "|_____|" + "\n");
        break;
      case 3:
        System.out.println(
            "\n" +
                " _____" + "\n" +
                "|  *  |" + "\n" +
                "| * * |" + "\n" +
                "|_____|" + "\n");
        break;
      case 4:
        System.out.println(
            "\n" +
                " _____" + "\n" +
                "| * * |" + "\n" +
                "| * * |" + "\n" +
                "|_____|" + "\n");
        break;
      case 5:
        System.out.println(
            "\n" +
                " _____" + "\n" +
                "| * * |" + "\n" +
                "|* * *|" + "\n" +
                "|_____|" + "\n");
        break;
      case 6:
        System.out.println(
            "\n" +
                " _____" + "\n" +
                "|* * *|" + "\n" +
                "|* * *|" + "\n" +
                "|_____|" + "\n");
        break;
    }

    System.out.println("A " + die + " was rolled.\n");
  }
}
