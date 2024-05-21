public class Die {
  private int score;

  public int roll() {
    double test = (double)Math.random() * 6 + 1;

    this.score = (int)test;
    System.out.println(this.score);

    return this.score;
  }
}