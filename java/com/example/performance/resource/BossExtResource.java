package com.example.performance.resource;

import com.example.performance.domain.Boss;
import com.example.performance.service.IBossExtService;
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


@Path("/api/boss/ext")
@Singleton
public class BossExtResource {

    private final IBossExtService bossExtService;

    @Inject
    public BossExtResource(IBossExtService bossExtService) {
        this.bossExtService = bossExtService;
    }


    @GET
    @Path("/custom")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBossList(@Context HttpHeaders httpHeaders) {
        List<Boss> bossList = bossExtService.customMethod();
        return Response.ok(bossList).build();
    }


}

