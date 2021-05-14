package Concrete;

import Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println("oyuncu eklendi :"+ gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("oyuncu silindi :"+ gamer.getFirstName());
		
	}

	@Override
	public void uptade(Gamer gamer) {
		System.out.println("oyuncu g�ncellendi :"+ gamer.getFirstName());
		
	}

	
	
     
}
