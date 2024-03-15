package com.example.androidtoka;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListUserInRecycleViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        RecyclerView UserView = findViewById(R.id.rvUserView);
        UserView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize UserStorage (assuming it's a singleton)
        UserStorage userStorage = UserStorage.getInstance();

        // Set up the RecyclerView adapter
        UserView.setAdapter(new UserListAdapter(getApplicationContext(), userStorage.getUsers()));

    }

}
