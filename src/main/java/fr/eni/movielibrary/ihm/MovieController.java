package fr.eni.movielibrary.ihm;

import fr.eni.movielibrary.bo.Member;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Opinion;
import fr.eni.movielibrary.bo.ProcessResult;
import org.springframework.beans.factory.annotation.Autowired;
import fr.eni.movielibrary.bll.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes({"member", "movie", "participants", "genres"})
public class MovieController {

	@Autowired
	MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping("/movies")
	public String showAll(Model model) {
		model.addAttribute("movies", movieService.getAllMovies());
		return "movies";
	}

	@GetMapping("/movies/detail")
	public String showMovie(@RequestParam("id") int id, Model model) {
		model.addAttribute("movie", movieService.getMovieById(id));
		model.addAttribute("review", new Opinion());
		return "detail";
	}

	@GetMapping("/movies/add")
	public String addMovie(Model model) {
		Member loggedUser = (Member) model.getAttribute("member");
		if (loggedUser != null && loggedUser.getId() != 0) {
			model.addAttribute("movie", new Movie());
			model.addAttribute("participants", movieService.getParticipants());
			model.addAttribute("genres", movieService.getGenres());
			return "movie_form";
		} else {
			return "redirect:/login";
		}
	}

	@PostMapping("/movies/add")
	public String createMovie(@ModelAttribute("formMovie") Movie movie, Model model) {
		ProcessResult result = movieService.addMovie(movie);
		if (result.isValid()) {
			return "redirect:/";
		}
		model.addAttribute("errors", result.getErrors());
		model.addAttribute("movie", movie);
		return "movie_form";
	}

}
