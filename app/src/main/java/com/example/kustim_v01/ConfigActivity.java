package com.example.kustim_v01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;

public class ConfigActivity extends AppCompatActivity implements View.OnClickListener {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    TextView config_email;
    TextView config_name;
    Button config_logout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config_activity);

        config_logout = findViewById(R.id.config_logout);
        config_logout.setOnClickListener(this);
        config_email = findViewById(R.id.config_email);
        config_email.setText(User.email);
        config_name = findViewById(R.id.config_name);
        config_name.setText(User.name);
    }


    public void onClick(View v) {
        if (v.getId() == R.id.config_logout){
            Intent intent = new Intent(this, SigninActivity.class);
            startActivity(intent);
        }
        }
}
