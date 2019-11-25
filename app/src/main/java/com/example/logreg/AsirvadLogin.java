package com.example.logreg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AsirvadLogin extends AppCompatActivity {
TextView signup;
Button cirLoginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asirvad_login);

        signup = (TextView)findViewById(R.id.signup);
        cirLoginButton = (Button)findViewById(R.id.cirLoginButton);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), AsirvadReg.class);
                startActivity(i);
            }
        });

        cirLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insti = new Intent(v.getContext(), AsirvadInstitution.class);
                startActivity(insti);
            }
        });

    }

}

