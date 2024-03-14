package com.example.androidtoka;

import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserViewHolder> {
    private List<User> userList;

    public UserListAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_view, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);
        holder.bind(user);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private TextView textFirstName;
        private TextView textLastName;
        private TextView textEmail;
        private TextView textDegreeProgram;

        public UserViewHolder(View itemView) {
            super(itemView);
            textFirstName = itemView.findViewById(R.id.txtFirstName);
            textLastName = itemView.findViewById(R.id.txtLastName);
            textEmail = itemView.findViewById(R.id.txtEmail);
            textDegreeProgram = itemView.findViewById(R.id.txtDegreeProgram);
        }

        public void bind(User user) {
            textFirstName.setText(user.getFirstName());
            textLastName.setText(user.getLastName());
            textEmail.setText(user.getEmail());
            textDegreeProgram.setText(user.getDegreeProgram());
        }
    }

}
