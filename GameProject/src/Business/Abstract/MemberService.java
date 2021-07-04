package Business.Abstract;

import Entities.Member;

public interface MemberService {
	void Add(Member member);
	
	void Update(Member member);
	
	void Delete(Member member);
}
