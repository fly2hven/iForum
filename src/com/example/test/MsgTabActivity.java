package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.app.SearchManager;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MsgTabActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_msg_tab);
		
		TabHost tabHost = getTabHost();
		
		TabSpec inboxspec = tabHost.newTabSpec("INBOX");
		TabSpec sentspec = tabHost.newTabSpec("SENT ITEMS");
		TabSpec contactspec = tabHost.newTabSpec("SENT ITEMS");
		
		inboxspec.setIndicator("Inbox", null);
        inboxspec.setContent(new Intent(this, InboxActivity.class));
        
        contactspec.setIndicator("Contact", null);
        contactspec.setContent(new Intent(this, ContactActivity.class));
        
        sentspec.setIndicator("Sent Items",  null);
        sentspec.setContent(new Intent(this, SentActivity.class));

        
        tabHost.addTab(inboxspec); 
        tabHost.addTab(sentspec); 
        tabHost.addTab(contactspec); 
        
       
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
