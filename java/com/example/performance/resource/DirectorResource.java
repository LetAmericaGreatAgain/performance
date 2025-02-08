package com.example.performance.resource;

import com.example.performance.domain.Director;
import com.example.performance.service.IDirectorService;
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


@Path("/api/director")
@Singleton
public class DirectorResource {

    private final IDirectorService directorService;

    @Inject
    public DirectorResource(IDirectorService directorService) {
        this.directorService = directorService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDirector(@NonNull @QueryParam("firstName") String firstName, @NonNull @QueryParam("lastName") String lastName, @Context HttpHeaders httpHeaders) {
        Director director = directorService.selectDirectorByFirstNameAndLastName(firstName, lastName);
        return Response.ok(director).build();
    }

    @POST
    @Path("/list")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDirectorList(Director director, @Context HttpHeaders httpHeaders) {
        List<Director> directorList = directorService.selectDirectorList(director);
        return Response.ok(directorList).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postDirector(@NonNull Director director, @Context HttpHeaders httpHeaders) {
        int i = directorService.insertDirector(director);
        return Response.ok(i).build();
    }

    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveDirector(@NonNull Director director, @Context HttpHeaders httpHeaders) {
        int i = directorService.saveDirectorByFirstNameAndLastName(director);
        return Response.ok(i).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putDirector(@NonNull Director director, @Context HttpHeaders httpHeaders) {
        int i = directorService.updateDirector(director);
        return Response.ok(i).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteDirectorByFirstNameAndLastName(@NonNull @QueryParam("firstName") String firstName, @NonNull @QueryParam("lastName") String lastName, @Context HttpHeaders httpHeaders) {
        int i = directorService.deleteDirectorByFirstNameAndLastName(firstName, lastName);
        return Response.ok(i).build();
    }


}

