package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile_tab);
		
		Button btn = (Button) findViewById(R.id.buttonmsg);
        
        btn.setOnClickListener(new View.OnClickListener()
        
        {
        	 
            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(),MsgTabActivity.class);
                startActivity(i);
            }
        });
    }
		
	}

