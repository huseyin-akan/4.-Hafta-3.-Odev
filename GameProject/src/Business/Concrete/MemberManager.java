package Business.Concrete;

import Business.Abstract.MemberService;
import Entities.Member;

public class MemberManager implements MemberService{

	@Override
	public void Add(Member member) {
		System.out.println(member.getFirstName() + member.getLastName() + " is added successfully!!");		
	}

	@Override
	public void Update(Member member) {
		System.out.println(member.getFirstName() + member.getLastName() + " is updated successfully!!");		
	}

	@Override
	public void Delete(Member member) {
		System.out.println(member.getFirstName() + member.getLastName() + " is deleted successfully!!");		
	}

}
