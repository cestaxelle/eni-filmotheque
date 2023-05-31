package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Opinion;
import fr.eni.movielibrary.bo.ProcessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes({"member", "movie", "participants", "genres"})
public class OpinionController {

	@Autowired
	MovieService movieService;

	public OpinionController(MovieService movieService) {
		this.movieService = movieService;
	}

	@PostMapping("/reviews/add/{id}")
	public String publishReview(@PathVariable("id") int id, @ModelAttribute("formReview") Opinion review) {
		ProcessResult result = movieService.addReview(review, id);
		if (result.isValid()) {
			return "redirect:/";
		}
		System.out.println(String.format("Errors: %s", result.getErrors()));
		return "redirect:/movies";

	}

}
