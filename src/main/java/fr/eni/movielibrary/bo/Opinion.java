package fr.eni.movielibrary.bo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Opinion {
	private long id;
	private int note;
	private String comment;

	public Opinion(long id, int note, String comment) {
		super();
		this.id = id;
		this.note = note;
		this.comment = comment;
	}

	public Opinion() {
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

	@Override
	public String toString() {
		return String.format("%s (%d/5)", comment, note);
	}

}
