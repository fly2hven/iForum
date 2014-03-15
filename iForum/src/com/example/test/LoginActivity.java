package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
 
public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.login);
 
        Button registerScreen = (Button) findViewById(R.id.signup);
 
        // Listening to register new account link
        
        registerScreen.setOnClickListener(new View.OnClickListener() 
        
         {
 
            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(),SignupActivity.class);
                startActivity(i);
            }
        });
        
        Button loginScreen = (Button) findViewById(R.id.login);
        
        loginScreen.setOnClickListener(new View.OnClickListener()
        
        {
        	 
            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(),AndroidTabActivity.class);
                startActivity(i);
            }
        });
    }
    
}


