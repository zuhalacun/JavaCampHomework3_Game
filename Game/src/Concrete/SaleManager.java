package Concrete;

import java.time.LocalDate;

import Abstract.ISaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements ISaleService {

	@Override
	public void saleGame(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName()+" oyuncusu "+game.getGameName()+" adl� oyunu sat�n ald�.");
		
	}

	@Override
	public void saleGameWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		
		double finalPrice = game.getGamePrice()-(game.getGamePrice()*campaign.getDiscountRate()/100);
		LocalDate start=campaign.getStartDate();
		LocalDate end=campaign.getEndDate();
		LocalDate today= LocalDate.now();
		
		if (start.getDayOfMonth() <= today.getDayOfMonth() && today.getDayOfMonth() <= end.getDayOfMonth()) {
            System.out.println("Kampanya bitmi�tir. " + game.getGamePrice() + " oyunun fiyat�d�r.");


        } else {
            System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + ": isimli oyuncu," + game.getGameName() + " adl� oyunu "+ finalPrice + "tl fiyat�na ald�.");

        }
		
		
		
		
		
		
	}
      
}
