package Business.Concrete;

import Business.Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;
import Entities.Sale;

import java.math.BigDecimal;

public class SaleManager implements SaleService{

	@Override
	public void sell(Member member, Game game) {
		Sale sale = new Sale(member.getId(), game.getId(), java.time.LocalDate.now(), game.getPrice());
		System.out.println(member.getFirstName() + " adlı üye " + game.getName() + " isimli oyunu" + java.time.LocalDate.now() + " tarihinde " +
				java.time.LocalTime.now() + " saatinde satın aldı.");	
		System.out.println("Satış fiyatı: " + sale.getSalePrice());
	}
	
	@Override
	public void sell(Member member, Game game, Campaign campaign) {
		Sale sale = new Sale(member.getId(), game.getId(), java.time.LocalDate.now(), game.getPrice().multiply(BigDecimal.valueOf((1- campaign.getDiscountRate()))) );
		System.out.println(member.getFirstName() + " adlı üye " + game.getName() + " isimli oyunu" + java.time.LocalDate.now() + " tarihinde " +
				java.time.LocalTime.now() + " saatinde satın aldı.");	
		System.out.println("Satış fiyatı: " + sale.getSalePrice());
	}

}
