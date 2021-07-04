package Business.Concrete;

import Business.Abstract.MemberValidationService;
import Entities.Member;

public class FakeValidator implements MemberValidationService {

	@Override
	public Boolean validate(Member member) {		
		
		if (member.getFirstName() != "denemeFalse") {
			return true;
		}else {
			return false;
		}

	}

}
