package com.example.test;

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

public class TabNewActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_new);
		
		Intent i = getIntent();
		String s = i.getStringExtra("titles");
		
		TabHost tabHost = getTabHost();
		
		TabSpec threadspec = tabHost.newTabSpec("THREAD");
		TabSpec authspec = tabHost.newTabSpec("AUTHOR");
		TabSpec repspec = tabHost.newTabSpec("REPLIES");
		
		threadspec.setIndicator("",  getResources().getDrawable(R.drawable.thread));
		Intent intent = new Intent(this, ThreadActivity.class);
		intent.putExtra("titles",s);
        threadspec.setContent(intent);
        
        authspec.setIndicator("",  getResources().getDrawable(R.drawable.author));
        authspec.setContent(new Intent(this, AuthActivity.class));
        
        repspec.setIndicator("",  getResources().getDrawable(R.drawable.replies));
        repspec.setContent(new Intent(this, RepActivity.class));

        
        tabHost.addTab(threadspec); 
        tabHost.addTab(authspec); 
        tabHost.addTab(repspec);
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

