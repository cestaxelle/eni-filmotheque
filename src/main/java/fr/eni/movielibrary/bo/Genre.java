package fr.eni.movielibrary.bo;

public class Genre {
	private long id;
	private String label;

	public Genre(long id, String label) {
		super();
		this.id = id;
		this.label = label;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
//		return String.format("%s [id=%d]", label, id);
		return label;
	}

}
