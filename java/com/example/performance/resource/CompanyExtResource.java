package com.example.performance.resource;

import com.example.performance.domain.Company;
import com.example.performance.service.ICompanyExtService;
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


@Path("/api/company/ext")
@Singleton
public class CompanyExtResource {

    private final ICompanyExtService companyExtService;

    @Inject
    public CompanyExtResource(ICompanyExtService companyExtService) {
        this.companyExtService = companyExtService;
    }


    @GET
    @Path("/custom")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCompanyList(@Context HttpHeaders httpHeaders) {
        List<Company> companyList = companyExtService.customMethod();
        return Response.ok(companyList).build();
    }


}

