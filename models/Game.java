package models;

public class Game {

  Dealer dealer = new Dealer();
  Player player = new Player();

  public void start() {
    dealer.play();
    player.play();
  }


  public void checkForWinner() {

  }

}