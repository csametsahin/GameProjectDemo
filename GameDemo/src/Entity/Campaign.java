package Entity;

import Abstract.IEntity;

public class Campaign implements IEntity{
			private int id ;
			private int campaignPrice;
			public Campaign(int id, int campaignPrice) {
				super();
				this.id = id;
				this.campaignPrice = campaignPrice;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public int getCampaignPrice() {
				return campaignPrice;
			}
			public void setCampaignPrice(int campaignPrice) {
				this.campaignPrice = campaignPrice;
			}
			
			
}
