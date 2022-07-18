package com.demo.soap.cxf.dao;

import java.util.List;

import in.benchresources.entities.music.Movie;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;

@Repository("musicDAO")
public class MusicDAOImpl implements MusicDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Movie> getAllMovies() {
		Transaction transaction = null;
		List<Movie> movies = null;
		try {
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			movies = session.createSQLQuery("select * from music").list();
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
		}
		return movies;
	}
	@SuppressWarnings("unchecked")
	@Override
	public void saveMovies(Movie movie) {
		Transaction transaction = null;
		try{
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(movie);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public Movie getMovieById(int movieId) {
		Transaction transaction = null;
		Movie movie = null;
		try{
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			movie = (Movie) session.get(Movie.class, movieId);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
		}
		return movie;
	}
	@SuppressWarnings("unchecked")
	@Override
	public void updateUser(Movie movie) {
		Transaction transaction = null;
		try{
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(movie);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public void deleteMovieById(int id) {
		Transaction transaction = null;
		try{
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Movie movie= (Movie) session.get(Movie.class, id);
			session.delete(movie);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null)
				transaction.rollback();
		}
	}
}