package fr.eni.movielibrary.bll;

import fr.eni.movielibrary.bo.*;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Profile("dev")
public class MemberServiceMock implements MemberService {
	private static List<Member> members;

	public MemberServiceMock() {
		members = new ArrayList<>();
		Member test = new Member(1, "TEST", "Test", "test", "mdp123", false, new ArrayList<>());
		Member admin = new Member(2, "ADMIN", "Admin", "admin", "mdp123", true, new ArrayList<>());
		members.add(test);
		members.add(admin);
	}

	@Override
	public List<Member> getAllMembers() {
		return members;
	}
	@Override
	public Member getMemberById(long id) {
		for (Member member : members) {
			if (member.getId() == id) {
				return member;
			}
		}
		return null;
	}

	@Override
	public Member login(Member member) {
		for (Member m : members) {
			if (m.getLogin().equals(member.getLogin()) && m.getPassword().equals(member.getPassword())) {
				return m;
			}
		}
		return null;
	}

}
