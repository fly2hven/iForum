package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
 
public class SignupActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.signup);
 
       Button loginScreen = (Button) findViewById(R.id.register);

        loginScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View arg0) {
                finish();
            }
        });
    }
}