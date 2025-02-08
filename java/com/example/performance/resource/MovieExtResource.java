package com.example.performance.resource;

import com.example.performance.domain.Movie;
import com.example.performance.service.IMovieExtService;
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


@Path("/api/movie/ext")
@Singleton
public class MovieExtResource {

    private final IMovieExtService movieExtService;

    @Inject
    public MovieExtResource(IMovieExtService movieExtService) {
        this.movieExtService = movieExtService;
    }


    @GET
    @Path("/custom")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMovieList(@Context HttpHeaders httpHeaders) {
        List<Movie> movieList = movieExtService.customMethod();
        return Response.ok(movieList).build();
    }


}

