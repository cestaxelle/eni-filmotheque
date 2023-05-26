package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.MemberService;
import fr.eni.movielibrary.bo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"member"})
public class MemberController {
	@Autowired
	MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@GetMapping("/")
	public String home(Model model) {
		System.out.println(model.getAttribute("member"));
		if (model.getAttribute("member") == null) {
			model.addAttribute("member", new Member());
			return "login";
		} else {
			return "redirect:/movies";
		}
	}

	@PostMapping("/login")
	public String login(@ModelAttribute Member member, Model model) {
		Member loggedUser = memberService.login(member);
		if (loggedUser != null) {
			model.addAttribute("member", loggedUser);
			return "redirect:/movies";
		} else {
			model.addAttribute("alert", "Invalid credentials, please check your login and password.");
			return "login";
		}
	}

	@GetMapping("/logout")
	public String logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "redirect:/";
	}
}
