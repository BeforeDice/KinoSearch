package com.example.kinosearch.auth.Api.services;



import com.example.kinosearch.auth.Api.movies.Movies;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ForMeService {
    @GET("/movies?filter=forMe")
    Call<List<Movies>> getDate();
}
