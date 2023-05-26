package fr.eni.movielibrary.bll;

import fr.eni.movielibrary.bo.Member;

import java.util.List;

public interface MemberService {

	List<Member> getAllMembers();

	Member getMemberById(long id);

	Member login(Member member);

}
