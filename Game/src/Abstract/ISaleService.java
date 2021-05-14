package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface ISaleService {
	
	void saleGame(Game game, Gamer gamer);
	void saleGameWithCampaign(Game game,Gamer gamer,Campaign campaign);

}
