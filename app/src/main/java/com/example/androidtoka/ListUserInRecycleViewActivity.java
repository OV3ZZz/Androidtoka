package com.example.androidtoka;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListUserInRecycleViewActivity extends AppCompatActivity {

    private RecyclerView rvUserView;
    private UserStorage userStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        rvUserView = findViewById(R.id.rvUserView);
        rvUserView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize UserStorage (assuming it's a singleton)
        userStorage = UserStorage.getInstance();

        // Set up the RecyclerView adapter
        rvUserView.setAdapter(new UserListAdapter(getApplicationContext(), userStorage.getUsers()));

    }

}
