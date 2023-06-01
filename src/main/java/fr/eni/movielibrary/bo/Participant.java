package fr.eni.movielibrary.bo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Participant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String lastName;
	private String firstName;
	@ManyToMany(mappedBy = "actors")
	private List<Movie> actorMovies;

	public Participant() {}
	public Participant(long id, String lastName, String firstName) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public List<Movie> getActorMovies() {
		return actorMovies;
	}

	public void setActorMovies(List<Movie> actorMovies) {
		this.actorMovies = actorMovies;
	}

	@Override
//	public String toString() {
//		return String.format("%s %s [id=%d]", firstName, lastName, id);
//	}
	public String toString() {
		return String.format("%s %s", firstName, lastName);
	}
}
