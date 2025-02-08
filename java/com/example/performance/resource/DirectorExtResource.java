package com.example.performance.resource;

import com.example.performance.domain.Director;
import com.example.performance.service.IDirectorExtService;
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


@Path("/api/director/ext")
@Singleton
public class DirectorExtResource {

    private final IDirectorExtService directorExtService;

    @Inject
    public DirectorExtResource(IDirectorExtService directorExtService) {
        this.directorExtService = directorExtService;
    }


    @GET
    @Path("/custom")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDirectorList(@Context HttpHeaders httpHeaders) {
        List<Director> directorList = directorExtService.customMethod();
        return Response.ok(directorList).build();
    }


}

