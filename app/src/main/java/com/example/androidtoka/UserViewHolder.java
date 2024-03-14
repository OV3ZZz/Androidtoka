package com.example.androidtoka;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView firstName, lastName, email, degreeProgram;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        firstName = itemView.findViewById(R.id.txtFirstName);
        lastName = itemView.findViewById(R.id.txtLastName);
        email = itemView.findViewById(R.id.txtEmail);
        degreeProgram = itemView.findViewById(R.id.txtDegreeProgram);
    }
}
