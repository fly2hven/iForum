package com.example.test;

import android.app.ActionBar;
import android.app.SearchManager;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AndroidTabActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		TabHost tabHost = getTabHost();
		
		TabSpec homespec = tabHost.newTabSpec("HOME");
		TabSpec profilespec = tabHost.newTabSpec("PROFILE");
		
		homespec.setIndicator("", getResources().getDrawable(R.drawable.home));
        homespec.setContent(new Intent(this, HomeActivity.class));
        
        profilespec.setIndicator("",  getResources().getDrawable(R.drawable.profile));
        profilespec.setContent(new Intent(this, ProfileActivity.class));

        
        tabHost.addTab(homespec); 
        tabHost.addTab(profilespec); 
        
       
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
        
		getMenuInflater().inflate(R.menu.menu, menu);
		
		SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search)
                .getActionView();
        searchView.setSearchableInfo(searchManager
                .getSearchableInfo(getComponentName()));
 
        return super.onCreateOptionsMenu(menu);
	
		
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.action_cp:
		Intent i = new Intent(getApplicationContext(),Edit.class);
		startActivity(i);
		return true;
		case R.id.action_so:
			Intent in = new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(in);
            finish();
            return true;
		
          default:
        	  return super.onOptionsItemSelected(item);
		   
		}
	}
	
	}


	
	
	
	
	
