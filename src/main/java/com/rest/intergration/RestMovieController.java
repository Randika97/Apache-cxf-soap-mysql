package com.rest.intergration;


import com.demo.soap.cxf.model.Music;
import com.demo.soap.cxf.service.MusicServiceImpl;
import in.benchresources.entities.music.AddMovieRequestType;
import in.benchresources.entities.music.Movie;
import in.benchresources.entities.music.MusicListByIdRequestType;
import in.benchresources.services.musicservice.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;



@RestController
@Path("/rest/")
@Produces("application/xml")
public class RestMovieController {
    @Autowired
    private MusicServiceImpl musicServiceImpl;

    public RestMovieController(MusicServiceImpl musicServiceImpl) {
        this.musicServiceImpl = musicServiceImpl;
    }

    @GET
    @Path("/{id}")
    public Response getMovieByID(@PathParam("id") MusicListByIdRequestType musicId) throws BusinessException {
        musicServiceImpl.getMovieById(musicId);
        Music music = new Music();
        if (music != null) {
            return Response.ok(music).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    public Response updateMovie(Movie movie) {
        return Response.ok().build();
    }

    @POST
    public Response saveMovies(AddMovieRequestType parameters) throws BusinessException {
        musicServiceImpl.addMovies(parameters);
        return Response.ok(parameters).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteMovies(@PathParam("id") int musicId) {
        return Response.ok().build();
    }
}