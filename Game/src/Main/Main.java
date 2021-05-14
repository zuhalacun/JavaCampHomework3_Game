package Main;

import java.time.LocalDate;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer=new Gamer("1","Zuhal","Acun", LocalDate.of(1996,06,13));
		Gamer gamer2=new Gamer("2","Duhan","Bulut", LocalDate.of(1995,07,13));
		GamerManager gamermanager=new GamerManager();
		gamermanager.add(gamer2);
		gamermanager.delete(gamer);
		
		System.out.println("----------");
		
		Game game=new Game(1,"Cs",90);
		Game game2=new Game(2,"Dota",100);
		GameManager gamemanager = new GameManager();
		gamemanager.add(game2);
		gamemanager.update(game);
		
		System.out.println("----------");
	
		Campaign campaign=new Campaign(1,"BlackFriday",25,LocalDate.of(2021,05,14),LocalDate.of(2021,06,14));
		CampaignManager campaignmanager=new CampaignManager();
		campaignmanager.add(campaign);
		
		System.out.println("----------");
		
		SaleManager salemanager=new SaleManager();
		salemanager.saleGame(game2, gamer2);
		salemanager.saleGameWithCampaign(game, gamer, campaign);
		
		
		
		
		
		
		
		
	
		

	}

}
