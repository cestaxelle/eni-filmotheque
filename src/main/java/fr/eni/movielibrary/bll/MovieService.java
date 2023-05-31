package fr.eni.movielibrary.bll;

import java.util.List;

import fr.eni.movielibrary.bo.*;

public interface MovieService {

	public List<Movie> getAllMovies();

	public Movie getMovieById(long id);

	public List<Genre> getGenres();

	public Genre getGenreById(long id);

	public List<Participant> getParticipants();

	public Participant getParticipantById(long id);

	public ProcessResult addMovie(Movie movie);

	public void saveMovie(Movie movie);

	public ProcessResult addReview(Opinion review, int id);

}
