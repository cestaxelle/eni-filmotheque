package fr.eni.movielibrary.bll;

import fr.eni.movielibrary.bo.Member;

import java.util.List;

public interface MemberService {

	public List<Member> getAllMembers();

	public Member getMemberById(long id);

	public Member login(Member member);

}
