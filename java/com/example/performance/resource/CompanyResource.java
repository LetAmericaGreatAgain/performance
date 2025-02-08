package com.example.performance.resource;

import com.example.performance.domain.Company;
import com.example.performance.service.ICompanyService;
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


@Path("/api/company")
@Singleton
public class CompanyResource {

    private final ICompanyService companyService;

    @Inject
    public CompanyResource(ICompanyService companyService) {
        this.companyService = companyService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCompany(@NonNull @QueryParam("no") String no, @Context HttpHeaders httpHeaders) {
        Company company = companyService.selectCompanyByNo(no);
        return Response.ok(company).build();
    }

    @POST
    @Path("/list")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCompanyList(Company company, @Context HttpHeaders httpHeaders) {
        List<Company> companyList = companyService.selectCompanyList(company);
        return Response.ok(companyList).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postCompany(@NonNull Company company, @Context HttpHeaders httpHeaders) {
        int i = companyService.insertCompany(company);
        return Response.ok(i).build();
    }

    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveCompany(@NonNull Company company, @Context HttpHeaders httpHeaders) {
        int i = companyService.saveCompanyByNo(company);
        return Response.ok(i).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response putCompany(@NonNull Company company, @Context HttpHeaders httpHeaders) {
        int i = companyService.updateCompany(company);
        return Response.ok(i).build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteCompanyByNo(@NonNull @QueryParam("no") String no, @Context HttpHeaders httpHeaders) {
        int i = companyService.deleteCompanyByNo(no);
        return Response.ok(i).build();
    }


}

