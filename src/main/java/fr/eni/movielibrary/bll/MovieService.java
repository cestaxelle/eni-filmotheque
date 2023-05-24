package fr.eni.movielibrary.bll;

import java.util.List;

import fr.eni.movielibrary.bo.Genre;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Participant;

public interface MovieService {

	public List<Movie> getAllMovies();

	public Movie getMovieById(long id);

	public List<Genre> getGenres();

	public Genre getGenreById(long id);

	public List<Participant> getParticipants();

	public Participant getParticipantById(long id);

	public void saveMovie(Movie movie);

}
