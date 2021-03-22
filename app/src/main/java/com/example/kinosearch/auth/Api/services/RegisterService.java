package com.example.kinosearch.auth.Api.services;



import com.example.kinosearch.auth.Api.model.RegisterRequest;
import com.example.kinosearch.auth.Api.model.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RegisterService {
    @POST("auth/register")
    Call<RegisterResponse> saveUser(@Body RegisterRequest registerRequest);
}
