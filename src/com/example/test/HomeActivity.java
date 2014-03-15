package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
 
public class HomeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        setContentView(R.layout.home_tab);
 
        Button movies = (Button) findViewById(R.id.Button1);
 
 
        
        movies.setOnClickListener(new View.OnClickListener() 
        
         {
 
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MoviesActivity.class);
                startActivity(i);
            }
        });
        
        Button foods = (Button) findViewById(R.id.Button2);
        
        foods.setOnClickListener(new View.OnClickListener()
        
        {
        	 
            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(),FoodsActivity.class);
                startActivity(i);
            }
        });
        
        Button sports = (Button) findViewById(R.id.Button3);
        
        sports.setOnClickListener(new View.OnClickListener()
        
        {
        	 
            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(),SportsActivity.class);
                startActivity(i);
            }
        });
        
        Button games = (Button) findViewById(R.id.Button4);
        
        games.setOnClickListener(new View.OnClickListener()
        
        {
        	 
            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(),GamesActivity.class);
                startActivity(i);
            }
        });
    }
}
