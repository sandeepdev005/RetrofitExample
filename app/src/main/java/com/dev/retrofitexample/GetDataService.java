package com.dev.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GetDataService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();


    @POST("/dresscode_new/api/services/Myorders")
    Call<DataModel> getData(@Body ApiRequestModel payload);
}
