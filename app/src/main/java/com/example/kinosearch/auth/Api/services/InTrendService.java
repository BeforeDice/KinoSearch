package com.example.kinosearch.auth.Api.services;



import com.example.kinosearch.auth.Api.movies.Movies;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InTrendService {
    @GET("/movies?filter=inTrend")
    Call<List<Movies>> getDate();
}
