package com.demo.soap.cxf.dao;

import java.util.List;

import in.benchresources.entities.music.Movie;

public interface MusicDAO {

	public List<Movie> getAllMovies();
	void saveMovies(Movie movie);
	Movie getMovieById(int movieId);
	void updateUser(Movie movie);
	void deleteMovieById(int id);
}