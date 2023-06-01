package fr.eni.movielibrary.bo;

import javax.persistence.*;

@Entity
public class Opinion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int note;
	private String comment;
	@ManyToOne()
	private Member author;
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="movie_id")
	private Movie movie;

	public Opinion() {}
	public Opinion(long id, int note, String comment) {
		super();
		this.id = id;
		this.note = note;
		this.comment = comment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Member getAuthor() {
		return author;
	}

	public void setAuthor(Member author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return String.format("%s (%d/5)", comment, note);
	}

}
