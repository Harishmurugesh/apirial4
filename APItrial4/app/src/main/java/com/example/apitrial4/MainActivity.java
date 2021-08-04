package com.example.apitrial4;


import android.content.Context;
import android.os.Bundle;
import android.telecom.CallScreeningService;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Call<ResponseBody> call = APIclient.apIinterface().getResponse();

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                ResponseBody responseBody = response.body();
                if(response.isSuccessful()){
                    Toast.makeText(MainActivity.this,responseBody.getClass().getName() ,Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(getApplicationContext(),"An error occured" ,Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"An error occured"+ t.getLocalizedMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }


}