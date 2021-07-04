import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Business.Concrete.MemberManager;
import Business.Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class Main {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date member1BirthDate = null;
		try {
			member1BirthDate = sdf.parse("10/11/1992");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Member member1 = new Member(1, "Hüseyin" , "Akan", "29332962220", member1BirthDate, "husokanus" , "husokanus@gmail.com" , "123456" );
		Game game1 = new Game(1 , "PUBG" , new BigDecimal(250), 50);
		SaleManager sm = new SaleManager();
		MemberManager mm = new MemberManager();
		mm.Add(member1);
		
		Date saleDate = null;
		try {
			member1BirthDate = sdf.parse("10/11/2021");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Campaign campaign = new Campaign(1, 0.1 , "Husokanın Özel Sürprizi", saleDate);
		
		sm.sell(member1, game1, campaign);
		sm.sell(member1, game1);
		

	}

}
