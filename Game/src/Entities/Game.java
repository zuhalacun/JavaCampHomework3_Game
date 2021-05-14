package Entities;

public class Game {
      int gameNumber;
      String gameName;
      double gamePrice;
	
      public Game(int gameNumber, String gameName, double gamePrice) {
		super();
		this.gameNumber = gameNumber;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public int getGameNumber() {
		return gameNumber;
	}

	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	
 
	
     
}
