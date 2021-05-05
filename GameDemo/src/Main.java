import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Entity.Campaign;
import Entity.Customer;
import Entity.Game;
import Entity.Player;
import Loglama.DatabaseLogger;
import ServiceSimulation.EDevletServiceSimulation;

public class Main {

	public static void main(String[] args) {
					CustomerManager customerManager = new CustomerManager(new EDevletServiceSimulation(),new DatabaseLogger());
					Customer player = new Player(1,"samet","sam321","samet","þahin");
					customerManager.Add(player);
					customerManager.Update(player);
					customerManager.Delete(player);
					Game game = new Game(1,"Assasin Creed",220);
					Campaign kampanya = new Campaign(1,100);
					CampaignManager campaignManager = new CampaignManager();
					campaignManager.add(kampanya);
					campaignManager.delete(kampanya);
					campaignManager.update(kampanya);
					GameManager gameManager = new GameManager();
					gameManager.sell(game, player,kampanya);
					
					
	}

}
