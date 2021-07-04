package Business.Concrete;

import Business.Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " is added successfully!!");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " is deleted successfully!!");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " is updated successfully!!");		
	}
	
	
}
