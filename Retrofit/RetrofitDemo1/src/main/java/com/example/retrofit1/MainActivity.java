package com.example.retrofit1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.button);
    }

    public void click(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.androidhive.info/volley/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiManager apiService = retrofit.create(ApiManager.class);

        Call<LoginResult> call = apiService.getData("lyk", "1234");
        call.enqueue(new Callback<LoginResult>() {
            @Override
            public void onResponse(Call<LoginResult> call, Response<LoginResult> response) {
                if (response.isSuccess()) {
                    // do SomeThing
                } else {
                    //直接操作UI 返回的respone被直接解析成你指定的modle
                }
            }

            @Override
            public void onFailure(Call<LoginResult> call, Throwable t) {
                System.out.println();
                // do onFailure代码
            }
        });
    }

}
