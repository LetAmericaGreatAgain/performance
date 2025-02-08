package com.example.performance.resource;

import com.example.performance.domain.Boss;
import com.example.performance.service.IBossService;
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


@Path("/api/boss")
@Singleton
public class BossResource {

    private final IBossService bossService;

    @Inject
    public BossResource(IBossService bossService) {
        this.bossService = bossService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBoss(@NonNull @QueryParam("idCard") String idCard, @Context HttpHeaders httpHeaders) {
        Boss boss = bossService.selectBossByIdCard(idCard);
        return Response.ok(boss).build();
    }

    @POST
    @Path("/list")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBossList(Boss boss, @Context HttpHeaders httpHeaders) {
        List<Boss> bossList = bossService.selectBossList(boss);
        return Response.ok(bossList).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postBoss(@NonNull Boss boss, @Context HttpHeaders httpHeaders) {
        int i = bossService.insertBoss(boss);
        return Response.ok(i).build();
    }

    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveBoss(@NonNull Boss boss, @Context HttpHeaders httpHeaders) {
        int i = bossService.saveBossByIdCard(boss);
        return Response.ok(i).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putBoss(@NonNull Boss boss, @Context HttpHeaders httpHeaders) {
        int i = bossService.updateBoss(boss);
        return Response.ok(i).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteBossByIdCard(@NonNull @QueryParam("idCard") String idCard, @Context HttpHeaders httpHeaders) {
        int i = bossService.deleteBossByIdCard(idCard);
        return Response.ok(i).build();
    }


}

