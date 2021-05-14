package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("kampanya eklendi :"+ campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("kampanya eklendi :"+ campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("kampanya g�ncellendi :"+ campaign.getCampaignName());
		
	}

}
