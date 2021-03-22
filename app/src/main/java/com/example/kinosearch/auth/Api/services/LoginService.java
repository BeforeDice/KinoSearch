package com.example.kinosearch.auth.Api.services;



import com.example.kinosearch.auth.Api.model.LoginRequest;
import com.example.kinosearch.auth.Api.model.LoginResponses;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginService {
    @POST("auth/login")
    Call<LoginResponses> authUser(@Body LoginRequest loginBody);
}
