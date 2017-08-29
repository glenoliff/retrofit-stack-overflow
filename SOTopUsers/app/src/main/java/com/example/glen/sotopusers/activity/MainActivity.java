package com.example.glen.sotopusers.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.glen.sotopusers.R;
import com.example.glen.sotopusers.adapter.UserAdapter;
import com.example.glen.sotopusers.api.APIClient;
import com.example.glen.sotopusers.api.StackOverflowUsers;
import com.example.glen.sotopusers.model.Items;
import com.example.glen.sotopusers.model.User;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Unbinder mUnbinder;

    @BindView(R.id.users) RecyclerView mUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mUnbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onStop() {
        super.onStop();

        if (mUnbinder != null) {
            mUnbinder.unbind();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadUsers();
    }

    private void loadUsers() {

        StackOverflowUsers sou = APIClient.getClient().create(StackOverflowUsers.class);

        Call<Items> call = sou.getTopUsers();

        call.enqueue(new Callback<Items>() {
            @Override
            public void onResponse(Call<Items> call, Response<Items> response) {
                mUsers.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
                mUsers.setAdapter(new UserAdapter(MainActivity.this, response.body().getUsers()));
            }

            @Override
            public void onFailure(Call<Items> call, Throwable t) {
                Log.e("SOT", "onFailure: ", t);
            }
        });
    }
}
