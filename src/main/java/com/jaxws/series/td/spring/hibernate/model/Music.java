package com.jaxws.series.td.spring.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "music")
public class Music implements Serializable {

	// member variables
	@Id 
	@GeneratedValue
	@Column(name = "MUSIC_ID")
	private int musicId;

	@Column(name= "MOVIE_NAME")
	private String movieName;

	@Column(name= "MOVIE_DIRECTOR")
	private String director;

	@Column(name= "YEAR_OF_RELEASE")
	private String yearOfRelease;

	@Column(name= "COMMENTS")
	private String comments;

	public Music() {
	}

	public Music(int musicId, String movieName, String director, String yearOfRelease, String comments) {
		this.musicId = musicId;
		this.movieName = movieName;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
		this.comments = comments;
	}

	// getters & setters
	public int getMusicId() {
		return musicId;
	}

	public void setMusicId(int musicId) {
		this.musicId = musicId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}