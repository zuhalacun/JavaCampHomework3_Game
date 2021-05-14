package Concrete;

import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements IGamerCheckService{

	@Override
	public boolean isGamerReal(Gamer gamer) {
		return true;
	}

}
