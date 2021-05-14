package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println("oyun eklendi :" + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("oyun silindi :" + game.getGameName());
	}

	@Override
	public void update(Game game) {
		System.out.println("oyun güncellendi :" + game.getGameName());
		
	}

	


	

}
