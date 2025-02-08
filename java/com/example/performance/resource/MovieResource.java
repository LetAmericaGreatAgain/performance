package com.example.performance.resource;

import com.example.performance.domain.Movie;
import com.example.performance.service.IMovieService;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.NonNull;

import java.util.List;


@Path("/api/movie")
@Singleton
public class MovieResource {

    private final IMovieService movieService;

    @Inject
    public MovieResource(IMovieService movieService) {
        this.movieService = movieService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMovie(@NonNull @QueryParam("title") String title, @NonNull @QueryParam("year") Integer year, @NonNull @QueryParam("genre") String genre, @Context HttpHeaders httpHeaders) {
        Movie movie = movieService.selectMovieByTitleAndYearAndGenre(title, year, genre);
        return Response.ok(movie).build();
    }

    @POST
    @Path("/list")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMovieList(Movie movie, @Context HttpHeaders httpHeaders) {
        List<Movie> movieList = movieService.selectMovieList(movie);
        return Response.ok(movieList).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postMovie(@NonNull Movie movie, @Context HttpHeaders httpHeaders) {
        int i = movieService.insertMovie(movie);
        return Response.ok(i).build();
    }

    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveMovie(@NonNull Movie movie, @Context HttpHeaders httpHeaders) {
        int i = movieService.saveMovieByTitleAndYearAndGenre(movie);
        return Response.ok(i).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putMovie(@NonNull Movie movie, @Context HttpHeaders httpHeaders) {
        int i = movieService.updateMovie(movie);
        return Response.ok(i).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteMovieByTitleAndYearAndGenre(@NonNull @QueryParam("title") String title, @NonNull @QueryParam("year") Integer year, @NonNull @QueryParam("genre") String genre, @Context HttpHeaders httpHeaders) {
        int i = movieService.deleteMovieByTitleAndYearAndGenre(title, year, genre);
        return Response.ok(i).build();
    }


}

