package fr.eni.movielibrary.ihm;

import org.springframework.beans.factory.annotation.Autowired;

import fr.eni.movielibrary.bll.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieController {

	@Autowired
	MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

//	@GetMapping("/")
//	public String home() {
//		return "index";
//	}

	@GetMapping("/movies")
	public String showAll(Model model) {
		model.addAttribute("movies", movieService.getAllMovies());
		return "movies";
	}

	@GetMapping("/movies/detail")
	public String showMovie(@RequestParam("id") int id, Model model) {
		model.addAttribute("movie", movieService.getMovieById(id));
		return "detail";
	}

}
