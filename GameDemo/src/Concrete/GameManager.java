package Concrete;

import Abstract.IGameService;
import Entity.Campaign;
import Entity.Customer;
import Entity.Game;

public class GameManager implements IGameService {

	@Override
	public void sell(Game game, Customer customer,Campaign campaign) {
		System.out.println(game.getGameName()  + customer.getUsername() + " tarafýndan" + campaign.getCampaignPrice() + " kampanyalý satýldý");
	}

	
}
