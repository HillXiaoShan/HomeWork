package com.bw.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.regist)
    Button regist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @OnClick(R.id.regist)
    public void setRegist(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public void getnet(){

        Http.GetRequest request = null;
        Call<MyEntity> call=request.getCall("");
        call.enqueue(new Callback<MyEntity>() {
            @Override
            public void onResponse(Call<MyEntity> call, Response<MyEntity> response) {

            }

            @Override
            public void onFailure(Call<MyEntity> call, Throwable t) {

            }
        });


    }
}
