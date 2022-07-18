package com.jaxws.series.td.spring.hibernate.service;


import in.benchresources.entities.music.*;
import in.benchresources.services.musicservice.BusinessException;
import in.benchresources.services.musicservice.IMusicService;
import java.util.List;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import com.jaxws.series.td.spring.hibernate.dao.MusicDAO;

@WebService(serviceName="MusicService", endpointInterface="in.benchresources.services.musicservice.IMusicService",
targetNamespace="http://benchresources.in/services/MusicService/", portName="MusicServicePort", name="MusicServiceImpl")
public class MusicServiceImpl extends SpringBeanAutowiringSupport implements IMusicService {

	@Autowired
	private MusicDAO musicDAO;

	@Override
	public MusicListByIdResponseType getMovieById(MusicListByIdRequestType parameters) throws BusinessException {
		// local variables
		MusicListByIdResponseType musicListByIdResponseType = null;
		BusinessFaultType businessFaultType = null;

		try{
			if(null != parameters){
				Movie movie = musicDAO.getMovieById(parameters.getMusicId());
				musicListByIdResponseType = new MusicListByIdResponseType();
				musicListByIdResponseType.getMovie().add(movie);
			}
		}
		catch(Exception ex){
			businessFaultType = new BusinessFaultType();
			businessFaultType.setErrorCode(16359);
			businessFaultType.setErrorMessage("Error in invoking Music Service " + ex.getMessage());
			businessFaultType.setErrorDescription(ex.getStackTrace().toString());
		}
		finally{
		}
		return musicListByIdResponseType;
	}

	@Override
	public MusicListResponseType getAllMovieDetailByComposer(MusicListRequestType parameters) throws BusinessException {
		// local variables
		List<Movie> listMovies = null;
		MusicListResponseType musicListResponseType = null;
		BusinessFaultType businessFaultType = null;
		try{
			if(null != parameters){
				// invoke dao to get values
				listMovies = musicDAO.getAllMovies();
				// create musicListType to set return/response values
				musicListResponseType = new MusicListResponseType();
				musicListResponseType.getMovie().addAll(listMovies);
			}
		}
		catch(Exception ex){
			// dummy setting for business exception, we can set more meaningful error depending on the business requirements
			businessFaultType = new BusinessFaultType();
			businessFaultType.setErrorCode(16359);
			businessFaultType.setErrorMessage("Error in invoking Music Service " + ex.getMessage());
			businessFaultType.setErrorDescription(ex.getStackTrace().toString());
		}
		finally{
			// close resources, if any
		}
		return musicListResponseType;
	}

	public AddMovieResponseType addMovies(AddMovieRequestType parameters) throws BusinessException {
		// local variables
		AddMovieResponseType addMovieResponseType = null;
		BusinessFaultType businessFaultType = null;
		try{
			if(null != parameters){
				Movie movie = new Movie();
				movie.setMovieName(parameters.getMovieName());
				movie.setMusicId(parameters.getMusicId());
				movie.setDirector(parameters.getDirector());
				movie.setYear(parameters.getYear());
				movie.setComments(parameters.getComments());
				musicDAO.saveMovies(movie);
				addMovieResponseType = new AddMovieResponseType();
			}
		}
		catch(Exception ex){
			// dummy setting for business exception, we can set more meaningful error depending on the business requirements
			businessFaultType = new BusinessFaultType();
			businessFaultType.setErrorCode(16359);
			businessFaultType.setErrorMessage("Error in invoking Music Service " + ex.getMessage());
			businessFaultType.setErrorDescription(ex.getStackTrace().toString());
		}
		finally{
		}
		return addMovieResponseType;
	}
}