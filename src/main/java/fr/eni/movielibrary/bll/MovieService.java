package fr.eni.movielibrary.bll;

import java.util.List;

import fr.eni.movielibrary.bo.*;

public interface MovieService {

	List<Movie> getAllMovies();

	Movie getMovieById(long id);

	List<Genre> getGenres();

	Genre getGenreById(long id);

	List<Participant> getParticipants();

	Participant getParticipantById(long id);

	ProcessResult addMovie(Movie movie);

	void saveMovie(Movie movie);

	ProcessResult addReview(Opinion review, int id);

}
