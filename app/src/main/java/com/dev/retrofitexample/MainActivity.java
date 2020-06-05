package com.dev.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        madeApiCall();

        PostPayload();
    }

    public void madeApiCall(){
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<RetroPhoto>> call = service.getAllPhotos();
        call.enqueue(new Callback<List<RetroPhoto>>() {
            @Override
            public void onResponse(Call<List<RetroPhoto>> call, Response<List<RetroPhoto>> response) {
                Toast.makeText(MainActivity.this, "success!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<RetroPhoto>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public  void PostPayload(){
        ApiRequestModel apiRequestModel = new ApiRequestModel();
        apiRequestModel.setApi_key("2308691");
        apiRequestModel.setLang("en");
        apiRequestModel.setUser_id("15");

        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<DataModel> call = service.getData(apiRequestModel);
        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                Toast.makeText(MainActivity.this, "success!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Faliled!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
