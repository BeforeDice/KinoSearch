package com.example.kinosearch.auth.Api.services;



import com.example.kinosearch.auth.Api.movies.MoviesCover;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoverService {
    @GET("/movies/cover")
    Call<MoviesCover> getDate();
}
