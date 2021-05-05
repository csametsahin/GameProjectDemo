package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignPrice() + " lýk kampanya eklendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignPrice() + " lýk kampanya silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignPrice() + " lýk kampanya güncellendi");
		
	}

}
