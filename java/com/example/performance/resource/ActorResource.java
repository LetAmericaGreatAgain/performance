package com.example.performance.resource;

import com.example.performance.domain.Actor;
import com.example.performance.service.IActorService;
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


@Path("/api/actor")
@Singleton
public class ActorResource {

    private final IActorService actorService;

    @Inject
    public ActorResource(IActorService actorService) {
        this.actorService = actorService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getActor(@NonNull @QueryParam("firstName") String firstName, @NonNull @QueryParam("lastName") String lastName, @Context HttpHeaders httpHeaders) {
        Actor actor = actorService.selectActorByFirstNameAndLastName(firstName, lastName);
        return Response.ok(actor).build();
    }

    @POST
    @Path("/list")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getActorList(Actor actor, @Context HttpHeaders httpHeaders) {
        List<Actor> actorList = actorService.selectActorList(actor);
        return Response.ok(actorList).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postActor(@NonNull Actor actor, @Context HttpHeaders httpHeaders) {
        int i = actorService.insertActor(actor);
        return Response.ok(i).build();
    }

    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveActor(@NonNull Actor actor, @Context HttpHeaders httpHeaders) {
        int i = actorService.saveActorByFirstNameAndLastName(actor);
        return Response.ok(i).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putActor(@NonNull Actor actor, @Context HttpHeaders httpHeaders) {
        int i = actorService.updateActor(actor);
        return Response.ok(i).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteActorByFirstNameAndLastName(@NonNull @QueryParam("firstName") String firstName, @NonNull @QueryParam("lastName") String lastName, @Context HttpHeaders httpHeaders) {
        int i = actorService.deleteActorByFirstNameAndLastName(firstName, lastName);
        return Response.ok(i).build();
    }


}

