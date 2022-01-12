package com;

public class Movie {

	@SuppressWarnings("unused")
	private String movieId;
	private String movieName;
	private String producedBy;
	private String directedBy;
	private long duration;
	private String year;
	private CATEGORY category;

	private static int movieCount;

	{
		movieCount++;
	}

	public Movie(String movieName, String producedBy) {
		super();
		this.movieName = movieName;
		this.producedBy = producedBy;
	}

	public Movie(String movieName, String producedBy, String directedBy, long duration, String year,
			CATEGORY category) {
		this(movieName, producedBy);
		this.movieName = movieName;
		this.producedBy = producedBy;
		this.directedBy = directedBy;
		this.duration = duration;
		this.year = year;
		this.category = category;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getProducedBy() {
		return producedBy;
	}

	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}

	public String getDirectedBy() {
		return directedBy;
	}

	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public CATEGORY getCategory() {
		return category;
	}

	public void setCategory(CATEGORY category) {
		this.category = category;
	}

	public static int getMovieCount() {
		return movieCount;
	}

	public static void setMovieCount(int movieCount) {
		Movie.movieCount = movieCount;
	}

	public String getMovieId() {
		return movieName+"_"+movieCount;
	}
	
	public String showDetails() {
		return getMovieId() + " "+ getMovieName() +" "+getProducedBy() + " "+ getDirectedBy()+" "+getDuration()+" "+getYear()+" "+getCategory();
	}

}
