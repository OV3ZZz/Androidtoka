package com.example.androidtoka;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;

public class AddUserActivity extends AppCompatActivity {
    private EditText editFirstName;
    private EditText editLastName;
    private EditText editEmail;
    private Button addUserButton;
    private RadioGroup radioDegreeProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editEmail = findViewById(R.id.editEmail);
        addUserButton = findViewById(R.id.addUserButton);
        radioDegreeProgram = findViewById(R.id.radioDegreeProgram);

        addUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = editFirstName.getText().toString();
                String lastName = editLastName.getText().toString();
                String email = editEmail.getText().toString();

                int selectedId = radioDegreeProgram.getCheckedRadioButtonId();

                RadioButton radioButton = findViewById(selectedId);
                String degreeProgram = radioButton.getText().toString();

                User user = new User(firstName, lastName, email, degreeProgram);
                UserStorage.getInstance().addUser(user);

                finish();
            }
        });
    }
}
