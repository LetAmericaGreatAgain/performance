package com.example.performance.resource;

import com.example.performance.domain.Actor;
import com.example.performance.service.IActorExtService;
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


@Path("/api/actor/ext")
@Singleton
public class ActorExtResource {

    private final IActorExtService actorExtService;

    @Inject
    public ActorExtResource(IActorExtService actorExtService) {
        this.actorExtService = actorExtService;
    }


    @GET
    @Path("/custom")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getActorList(@Context HttpHeaders httpHeaders) {
        List<Actor> actorList = actorExtService.customMethod();
        return Response.ok(actorList).build();
    }


}

